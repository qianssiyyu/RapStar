package com.rapstar.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSlistdetail<M extends BaseSlistdetail<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setListid(java.lang.Integer listid) {
		set("listid", listid);
		return (M)this;
	}
	
	public java.lang.Integer getListid() {
		return getInt("listid");
	}

	public M setSongid(java.lang.Integer songid) {
		set("songid", songid);
		return (M)this;
	}
	
	public java.lang.Integer getSongid() {
		return getInt("songid");
	}

}
