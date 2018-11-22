package com.three.model;
public class VocationModel {
	private int holidayId;
	private String holidayName;
	private String holidayStartTime;
	private String holidayEndTime;
	private int shopId;
	private int linerId;
	private int placeId;
	private int shiftId;

	public int getHolidayId() {
		return holidayId;
	}

	public void setHolidayId(int holidayId) {
		this.holidayId = holidayId;
	}

	public String getHolidayName() {
		return holidayName;
	}

	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}

	public String getHolidayStartTime() {
		return holidayStartTime;
	}

	public void setHolidayStartTime(String holidayStartTime) {
		this.holidayStartTime = holidayStartTime;
	}

	public String getHolidayEndTime() {
		return holidayEndTime;
	}

	public void setHolidayEndTime(String holidayEndTime) {
		this.holidayEndTime = holidayEndTime;
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

	@Override
	public String toString() {
		return "VocationManageModel [holidayId=" + holidayId + ", holidayName="
				+ holidayName + ", holidayStartTime=" + holidayStartTime
				+ ", holidayEndTime=" + holidayEndTime + ", shopId=" + shopId
				+ ", linerId=" + linerId + ", placeId=" + placeId
				+ ", shiftId=" + shiftId + "]";
	}

	public VocationModel(int holidayId, String holidayName,
			String holidayStartTime, String holidayEndTime, int shopId,
			int linerId, int placeId, int shiftId) {
		super();
		this.holidayId = holidayId;
		this.holidayName = holidayName;
		this.holidayStartTime = holidayStartTime;
		this.holidayEndTime = holidayEndTime;
		this.shopId = shopId;
		this.linerId = linerId;
		this.placeId = placeId;
		this.shiftId = shiftId;
	}

	public VocationModel() {
		super();

	}

	public VocationModel(String holidayName, String holidayStartTime,
			String holidayEndTime, int shopId, int linerId, int placeId,
			int shiftId) {
		super();
		this.holidayName = holidayName;
		this.holidayStartTime = holidayStartTime;
		this.holidayEndTime = holidayEndTime;
		this.shopId = shopId;
		this.linerId = linerId;
		this.placeId = placeId;
		this.shiftId = shiftId;
	}

}