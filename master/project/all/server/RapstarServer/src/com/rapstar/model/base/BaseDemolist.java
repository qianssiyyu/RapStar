package com.rapstar.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDemolist<M extends BaseDemolist<M>> extends Model<M> implements IBean {

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

	public M setPriority(java.lang.Integer priority) {
		set("priority", priority);
		return (M)this;
	}
	
	public java.lang.Integer getPriority() {
		return getInt("priority");
	}

	public M setImgpath(java.lang.String imgpath) {
		set("imgpath", imgpath);
		return (M)this;
	}
	
	public java.lang.String getImgpath() {
		return getStr("imgpath");
	}

}
