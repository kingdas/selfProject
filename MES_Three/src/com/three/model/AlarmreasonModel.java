package com.three.model;

public class AlarmreasonModel {

	private Integer reasonId;
	private String description;
	private Integer typeId;

	public Integer getReasonId() {
		return reasonId;
	}

	public void setReasonId(Integer reasonId) {
		this.reasonId = reasonId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public AlarmreasonModel(Integer reasonId, String description, Integer typeId) {
		super();
		this.reasonId = reasonId;
		this.description = description;
		this.typeId = typeId;
	}

	public AlarmreasonModel(String description, Integer typeId) {
		super();
		this.description = description;
		this.typeId = typeId;
	}

	public AlarmreasonModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AlarmreasonModel [reasonId=" + reasonId + ", description=" + description + ", typeId=" + typeId + "]";
	}

}
