package com.five.model;

public class ChejianModel {//车间管理
private Integer shopId;//车间ID
private String shopName;//车间名称
private String shopAdmin;//车间主管
public Integer getShopId() {
	return shopId;
}
public void setShopId(Integer shopId) {
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
public ChejianModel(Integer shopId, String shopName, String shopAdmin) {
	super();
	this.shopId = shopId;
	this.shopName = shopName;
	this.shopAdmin = shopAdmin;
}
public ChejianModel(String shopName, String shopAdmin) {
	super();
	this.shopName = shopName;
	this.shopAdmin = shopAdmin;
}
public ChejianModel() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ChejianModel [shopId=" + shopId + ", shopName=" + shopName
			+ ", shopAdmin=" + shopAdmin + "]";
}



}
