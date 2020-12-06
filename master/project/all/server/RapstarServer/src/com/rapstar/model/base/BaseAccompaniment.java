package com.rapstar.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAccompaniment<M extends BaseAccompaniment<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public M setAuthorid(java.lang.Integer authorid) {
		set("authorid", authorid);
		return (M)this;
	}
	
	public java.lang.Integer getAuthorid() {
		return getInt("authorid");
	}

	public M setIntro(java.lang.String intro) {
		set("intro", intro);
		return (M)this;
	}
	
	public java.lang.String getIntro() {
		return getStr("intro");
	}

	public M setTime(java.util.Date time) {
		set("time", time);
		return (M)this;
	}
	
	public java.util.Date getTime() {
		return get("time");
	}

	public M setImgpath(java.lang.String imgpath) {
		set("imgpath", imgpath);
		return (M)this;
	}
	
	public java.lang.String getImgpath() {
		return getStr("imgpath");
	}

	public M setStyle(java.lang.Integer style) {
		set("style", style);
		return (M)this;
	}
	
	public java.lang.Integer getStyle() {
		return getInt("style");
	}

	public M setMoney(java.lang.Double money) {
		set("money", money);
		return (M)this;
	}
	
	public java.lang.Double getMoney() {
		return getDouble("money");
	}

	public M setPath(java.lang.String path) {
		set("path", path);
		return (M)this;
	}
	
	public java.lang.String getPath() {
		return getStr("path");
	}

}
