package com.rapstar.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDemo<M extends BaseDemo<M>> extends Model<M> implements IBean {

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

	public M setAccid(java.lang.Integer accid) {
		set("accid", accid);
		return (M)this;
	}
	
	public java.lang.Integer getAccid() {
		return getInt("accid");
	}

	public M setLyricpath(java.lang.String lyricpath) {
		set("lyricpath", lyricpath);
		return (M)this;
	}
	
	public java.lang.String getLyricpath() {
		return getStr("lyricpath");
	}

	public M setTime(java.util.Date time) {
		set("time", time);
		return (M)this;
	}
	
	public java.util.Date getTime() {
		return get("time");
	}

	public M setPath(java.lang.String path) {
		set("path", path);
		return (M)this;
	}
	
	public java.lang.String getPath() {
		return getStr("path");
	}

	public M setImgpath(java.lang.String imgpath) {
		set("imgpath", imgpath);
		return (M)this;
	}
	
	public java.lang.String getImgpath() {
		return getStr("imgpath");
	}

	public M setPriority(java.lang.Integer priority) {
		set("priority", priority);
		return (M)this;
	}
	
	public java.lang.Integer getPriority() {
		return getInt("priority");
	}

	public M setStatu(java.lang.Integer statu) {
		set("statu", statu);
		return (M)this;
	}
	
	public java.lang.Integer getStatu() {
		return getInt("statu");
	}

}
