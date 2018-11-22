package com.three.model;
public class PositionManage {

	private int placeId;
	private String placeName;
	private String placeAdmin;
	private int shopId;
	private int linerId;
	private int opid;

	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceAdmin() {
		return placeAdmin;
	}

	public void setPlaceAdmin(String placeAdmin) {
		this.placeAdmin = placeAdmin;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getLinerId() {
		return linerId;
	}

	public void setLinerId(int linerId) {
		this.linerId = linerId;
	}

	public int getOpid() {
		return opid;
	}

	public void setOpid(int opid) {
		this.opid = opid;
	}

	@Override
	public String toString() {
		return "PositionManage [placeId=" + placeId + ", placeName=" + placeName + ", placeAdmin=" + placeAdmin
				+ ", shopId=" + shopId + ", linerId=" + linerId + ", opid=" + opid + "]";
	}

	public PositionManage(int placeId, String placeName, String placeAdmin, int shopId, int linerId, int opid) {
		super();
		this.placeId = placeId;
		this.placeName = placeName;
		this.placeAdmin = placeAdmin;
		this.shopId = shopId;
		this.linerId = linerId;
		this.opid = opid;
	}

	public PositionManage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PositionManage(String placeName, String placeAdmin, int shopId, int linerId, int opid) {
		super();
		this.placeName = placeName;
		this.placeAdmin = placeAdmin;
		this.shopId = shopId;
		this.linerId = linerId;
		this.opid = opid;
	}

}
