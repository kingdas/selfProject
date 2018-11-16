package com.five.model;

import java.sql.Time;
import java.util.Date;

public class BanciModel {
	private Integer shiftid;
	private String shiftname;
	private String shiftstarttime;
	private String shiftendtime;
	private Integer shopid;
	private Integer linerid;
	private Integer placeid;

	public Integer getShiftid() {
		return shiftid;
	}

	public void setShiftid(Integer shiftid) {
		this.shiftid = shiftid;
	}

	public String getShiftname() {
		return shiftname;
	}

	public void setShiftname(String shiftname) {
		this.shiftname = shiftname;
	}

	public String getShiftstarttime() {
		return shiftstarttime;
	}

	public void setShiftstarttime(String shiftstarttime) {
		this.shiftstarttime = shiftstarttime;
	}

	public String getShiftendtime() {
		return shiftendtime;
	}

	public void setShiftendtime(String shiftendtime) {
		this.shiftendtime = shiftendtime;
	}

	public Integer getShopid() {
		return shopid;
	}

	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}

	public Integer getLinerid() {
		return linerid;
	}

	public void setLinerid(Integer linerid) {
		this.linerid = linerid;
	}

	public Integer getPlaceid() {
		return placeid;
	}

	public void setPlaceid(Integer placeid) {
		this.placeid = placeid;
	}

	@Override
	public String toString() {
		return "BanciModel [shiftid=" + shiftid + ", shiftname=" + shiftname
				+ ", shiftstarttime=" + shiftstarttime + ", shiftendtime="
				+ shiftendtime + ", shopid=" + shopid + ", linerid=" + linerid
				+ ", placeid=" + placeid + "]";
	}

	public BanciModel(Integer shiftid, String shiftname, String shiftstarttime,
			String shiftendtime, Integer shopid, Integer linerid, Integer placeid) {
		super();
		this.shiftid = shiftid;
		this.shiftname = shiftname;
		this.shiftstarttime = shiftstarttime;
		this.shiftendtime = shiftendtime;
		this.shopid = shopid;
		this.linerid = linerid;
		this.placeid = placeid;
	}
	public BanciModel(String shiftname, Integer shopid, Integer linerid,
			Integer placeid) {
		super();
		this.shiftname = shiftname;
		this.shopid = shopid;
		this.linerid = linerid;
		this.placeid = placeid;
	}

	public BanciModel(String shiftname, String shiftstarttime, String shiftendtime,
			Integer shopid, Integer linerid, Integer placeid) {
		super();
		this.shiftname = shiftname;
		this.shiftstarttime = shiftstarttime;
		this.shiftendtime = shiftendtime;
		this.shopid = shopid;
		this.linerid = linerid;
		this.placeid = placeid;
	}

	public BanciModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
