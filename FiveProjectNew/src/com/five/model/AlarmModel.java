package com.five.model;

public class AlarmModel {//车间管理
private Integer reasonId;//ID
private String description;//报警描述
private String typeId;//报警类型
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
public String getTypeId() {
	return typeId;
}
public void setTypeId(String typeId) {
	this.typeId = typeId;
}
public AlarmModel(Integer reasonId, String description, String typeId) {
	super();
	this.reasonId = reasonId;
	this.description = description;
	this.typeId = typeId;
}
public AlarmModel(String description, String typeId) {
	super();
	this.description = description;
	this.typeId = typeId;
}
public AlarmModel() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "AlarmModel [reasonId=" + reasonId + ", description=" + description + ", typeId=" + typeId + "]";
}

}
