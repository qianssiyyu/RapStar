package com.rapstar.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseMusician<M extends BaseMusician<M>> extends Model<M> implements IBean {

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

	public M setShortpro(java.lang.String shortpro) {
		set("shortpro", shortpro);
		return (M)this;
	}
	
	public java.lang.String getShortpro() {
		return getStr("shortpro");
	}

	public M setLongpro(java.lang.String longpro) {
		set("longpro", longpro);
		return (M)this;
	}
	
	public java.lang.String getLongpro() {
		return getStr("longpro");
	}

	public M setSex(java.lang.String sex) {
		set("sex", sex);
		return (M)this;
	}
	
	public java.lang.String getSex() {
		return getStr("sex");
	}

	public M setUserid(java.lang.Integer userid) {
		set("userid", userid);
		return (M)this;
	}
	
	public java.lang.Integer getUserid() {
		return getInt("userid");
	}

	public M setPhotopath(java.lang.String photopath) {
		set("photopath", photopath);
		return (M)this;
	}
	
	public java.lang.String getPhotopath() {
		return getStr("photopath");
	}

}
