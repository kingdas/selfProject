package com.three.model;
public class SysWorkRest {
	private int restId;
	private String restName;
	private String restStartTime;
	private String restEndTime;
	private int shopId;
	private int linerId;
	private int placeId;
	private int shiftId;

	@Override
	public String toString() {
		return "SysWorkRest [restId=" + restId + ", restName=" + restName
				+ ", restStartTime=" + restStartTime + ", restEndTime="
				+ restEndTime + ", shopId=" + shopId + ", linerId=" + linerId
				+ ", placeId=" + placeId + ", shiftId=" + shiftId + "]";
	}

	public SysWorkRest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SysWorkRest(int restId, String restName, String restStartTime,
			String restEndTime, int shopId, int linerId, int placeId,
			int shiftId) {
		super();
		this.restId = restId;
		this.restName = restName;
		this.restStartTime = restStartTime;
		this.restEndTime = restEndTime;
		this.shopId = shopId;
		this.linerId = linerId;
		this.placeId = placeId;
		this.shiftId = shiftId;
	}

	public SysWorkRest(String restName, String restStartTime,
			String restEndTime, int shopId, int linerId, int placeId,
			int shiftId) {
		super();
		this.restName = restName;
		this.restStartTime = restStartTime;
		this.restEndTime = restEndTime;
		this.shopId = shopId;
		this.linerId = linerId;
		this.placeId = placeId;
		this.shiftId = shiftId;
	}

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}

	public String getRestStartTime() {
		return restStartTime;
	}

	public void setRestStartTime(String restStartTime) {
		this.restStartTime = restStartTime;
	}

	public String getRestEndTime() {
		return restEndTime;
	}

	public void setRestEndTime(String restEndTime) {
		this.restEndTime = restEndTime;
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

	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public int getShiftId() {
		return shiftId;
	}

	public void setShiftId(int shiftId) {
		this.shiftId = shiftId;
	}

}
