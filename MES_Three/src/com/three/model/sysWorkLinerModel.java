package com.three.model;
public class sysWorkLinerModel {
	private Integer LinerId;
	private String LinerName;
	private String LinerAdmin;
	private Integer ShopId;

	public Integer getLinerId() {
		return LinerId;
	}

	public void setLinerId(Integer linerId) {
		LinerId = linerId;
	}

	public String getLinerName() {
		return LinerName;
	}

	public void setLinerName(String linerName) {
		LinerName = linerName;
	}

	public String getLinerAdmin() {
		return LinerAdmin;
	}

	public void setLinerAdmin(String linerAdmin) {
		LinerAdmin = linerAdmin;
	}

	public Integer getShopId() {
		return ShopId;
	}

	public void setShopId(Integer shopId) {
		ShopId = shopId;
	}

	@Override
	public String toString() {
		return "sysWorkLinerModel [LinerId=" + LinerId + ", LinerName="
				+ LinerName + ", LinerAdmin=" + LinerAdmin + ", ShopId="
				+ ShopId + "]";
	}

	public sysWorkLinerModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public sysWorkLinerModel(Integer linerId, String linerName,
			String linerAdmin, Integer shopId) {
		super();
		LinerId = linerId;
		LinerName = linerName;
		LinerAdmin = linerAdmin;
		ShopId = shopId;
	}

	public sysWorkLinerModel(String linerName, String linerAdmin, Integer shopId) {
		super();
		LinerName = linerName;
		LinerAdmin = linerAdmin;
		ShopId = shopId;
	}

}
