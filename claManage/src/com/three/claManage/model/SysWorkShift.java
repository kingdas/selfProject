package com.three.claManage.model;

public class SysWorkShift {
	private Integer shiftId;
	private String shiftName;
	private String shiftStartTime;
	private String shiftEndTime;
	private Integer shopId;
	private Integer linerId;
	private Integer placeId;

	public Integer getShiftId() {
		return shiftId;
	}

	public void setShiftId(Integer shiftId) {
		this.shiftId = shiftId;
	}

	public String getShiftName() {
		return shiftName;
	}

	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}

	public String getShiftStartTime() {
		return shiftStartTime;
	}

	public void setShiftStartTime(String shiftStartTime) {
		this.shiftStartTime = shiftStartTime;
	}

	public String getShiftEndTime() {
		return shiftEndTime;
	}

	public void setShiftEndTime(String shiftEndTime) {
		this.shiftEndTime = shiftEndTime;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getLinerId() {
		return linerId;
	}

	public void setLinerId(Integer linerId) {
		this.linerId = linerId;
	}

	public Integer getPlaceId() {
		return placeId;
	}

	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

	@Override
	public String toString() {
		return "SysWorkShift [shiftId=" + shiftId + ", shiftName=" + shiftName + ", shiftStartTime=" + shiftStartTime
				+ ", shiftEndTime=" + shiftEndTime + ", shopId=" + shopId + ", linerId=" + linerId + ", placeId="
				+ placeId + "]";
	}

	public SysWorkShift() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SysWorkShift(Integer shiftId, String shiftName, String shiftStartTime, String shiftEndTime, Integer shopId,
			Integer linerId, Integer placeId) {
		super();
		this.shiftId = shiftId;
		this.shiftName = shiftName;
		this.shiftStartTime = shiftStartTime;
		this.shiftEndTime = shiftEndTime;
		this.shopId = shopId;
		this.linerId = linerId;
		this.placeId = placeId;
	}

	public SysWorkShift(String shiftName, String shiftStartTime, String shiftEndTime, Integer shopId, Integer linerId,
			Integer placeId) {
		super();
		this.shiftName = shiftName;
		this.shiftStartTime = shiftStartTime;
		this.shiftEndTime = shiftEndTime;
		this.shopId = shopId;
		this.linerId = linerId;
		this.placeId = placeId;
	}
}
