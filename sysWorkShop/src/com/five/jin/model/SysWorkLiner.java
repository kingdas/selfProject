package com.five.jin.model;

public class SysWorkLiner {
	private Integer linerId;
	private String linerName;
	private String linerAdmin;
	private String shopId;

	public Integer getLinerId() {
		return linerId;
	}

	public void setLinerId(Integer linerId) {
		this.linerId = linerId;
	}

	public String getLinerName() {
		return linerName;
	}

	public void setLinerName(String linerName) {
		this.linerName = linerName;
	}

	public String getLinerAdmin() {
		return linerAdmin;
	}

	public void setLinerAdmin(String linerAdmin) {
		this.linerAdmin = linerAdmin;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	@Override
	public String toString() {
		return "SysWorkLiner [linerId=" + linerId + ", linerName=" + linerName + ", linerAdmin=" + linerAdmin
				+ ", shopId=" + shopId + "]";
	}

	public SysWorkLiner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SysWorkLiner(Integer linerId, String linerName, String linerAdmin, String shopId) {
		super();
		this.linerId = linerId;
		this.linerName = linerName;
		this.linerAdmin = linerAdmin;
		this.shopId = shopId;
	}

	public SysWorkLiner(String linerName, String linerAdmin, String shopId) {
		super();
		this.linerName = linerName;
		this.linerAdmin = linerAdmin;
		this.shopId = shopId;
	}

}
