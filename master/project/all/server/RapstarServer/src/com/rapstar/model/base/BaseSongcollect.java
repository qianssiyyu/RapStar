package com.rapstar.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSongcollect<M extends BaseSongcollect<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setUserid(java.lang.Integer userid) {
		set("userid", userid);
		return (M)this;
	}
	
	public java.lang.Integer getUserid() {
		return getInt("userid");
	}

	public M setSongid(java.lang.Integer songid) {
		set("songid", songid);
		return (M)this;
	}
	
	public java.lang.Integer getSongid() {
		return getInt("songid");
	}

}
