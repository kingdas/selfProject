package com.three.model;

public class WorkshopManageModel {
	private int shopId;
	private String shopName;
	private String shopAdmin;

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAdmin() {
		return shopAdmin;
	}

	public void setShopAdmin(String shopAdmin) {
		this.shopAdmin = shopAdmin;
	}

	@Override
	public String toString() {
		return "WorkshopManageModel [shopId=" + shopId + ", shopName=" + shopName + ", shopAdmin=" + shopAdmin + "]";
	}

	public WorkshopManageModel(int shopId, String shopName, String shopAdmin) {
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopAdmin = shopAdmin;
	}

	public WorkshopManageModel(String shopName, String shopAdmin) {
		this.shopName = shopName;
		this.shopAdmin = shopAdmin;
	}

	public WorkshopManageModel() {
	}

}
