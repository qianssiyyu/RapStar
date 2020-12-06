package com.rapstar.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("acccollect", "id", Acccollect.class);
		arp.addMapping("acclist", "id", Acclist.class);
		arp.addMapping("accompaniment", "id", Accompaniment.class);
		arp.addMapping("alistdetail", "id", Alistdetail.class);
		arp.addMapping("demo", "id", Demo.class);
		arp.addMapping("democollect", "id", Democollect.class);
		arp.addMapping("demolist", "id", Demolist.class);
		arp.addMapping("dlistdetail", "id", Dlistdetail.class);
		arp.addMapping("following", "id", Following.class);
		arp.addMapping("musician", "id", Musician.class);
		arp.addMapping("slistcollect", "id", Slistcollect.class);
		arp.addMapping("slistdetail", "id", Slistdetail.class);
		arp.addMapping("song", "id", Song.class);
		arp.addMapping("songcollect", "id", Songcollect.class);
		arp.addMapping("songlist", "id", Songlist.class);
		arp.addMapping("style", "id", Style.class);
		arp.addMapping("user", "id", User.class);
	}
}

