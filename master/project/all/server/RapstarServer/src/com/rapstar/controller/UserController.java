package com.rapstar.controller;

import java.util.List;

import com.google.gson.Gson;
import com.jfinal.core.Controller;
import com.jfinal.kit.HttpKit;
import com.jfinal.kit.JsonKit;
import com.rapstar.model.User;
import com.rapstar.service.UserService;

public class UserController extends Controller {
	private Gson gson = new Gson();

	/**
	 * ��¼
	 */
	public void login() {
		// ��ȡǰ�˴�����json��
		// ��ȡ���ݣ�ͨ�����ķ�ʽ
		String s = HttpKit.readData(getRequest());
		User user = JsonKit.parse(s, User.class);
		boolean flag = UserService.isExitUser(user);
		if (flag) {
			// ������ϸ��Ϣ
			getSession().setAttribute("user", UserService.getUserMsg(user));

		}
		String returnStr = String.valueOf(flag);
		renderText(returnStr);

	}

	/**
	 * ע�� ����ֵ��true/false
	 */
	public void register() {
		String s = HttpKit.readData(getRequest());
		User user = JsonKit.parse(s, User.class);
		List<User> users = UserService.getAllUser();
		for (User user2 : users) {
			if (user.getPhone().equals(user2.getPhone())) {
				// �Ѿ����ڴ��û�
				renderText("false");
			}
		}
		boolean flag = UserService.addUser(user);
		String returnStr = String.valueOf(flag);
		// ���ӳɹ�/ʧ��
		renderText(returnStr);
	}

	/**
	 * �õ���¼�û�����Ϣ
	 */
	public void getLoginUserMsg() {
		User user = (User) getSession().getAttribute("user");
		// TODO:�ܲ������л��ն���
		if (user != null) {
			String json = gson.toJson(user);
			renderText(json);
		} else {
			renderText(null);
		}
	}

	/**
	 * ��ȡ��ͨ�û���Ϣ
	 */
	public void getUserMsg() {
		// ����Ҫ��ѯ����Ϣ
		String s = HttpKit.readData(getRequest());
		User user = JsonKit.parse(s, User.class);
		if (UserService.isExitUser(user)) {
			// ���ڴ��û�����ѯ��Ϣ������
			User user2 = UserService.getUserMsg(user);
			String json = gson.toJson(user2);
			renderText(json);
		} else {
			renderText(null);
		}
	}
}