package com.five.model;

public class GroupModel {
	private Integer groupId;
	private String groupName;
	private String describeGroup;

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getDescribeGroup() {
		return describeGroup;
	}

	public void setDescribeGroup(String describeGroup) {
		this.describeGroup = describeGroup;
	}

	public GroupModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GroupModel [groupId=" + groupId + ", groupName=" + groupName
				+ ", describeGroup=" + describeGroup + "]";
	}

	public GroupModel(Integer groupId, String groupName, String describeGroup) {

		this.groupId = groupId;
		this.groupName = groupName;
		this.describeGroup = describeGroup;
	}

	public GroupModel(String groupName, String describeGroup) {

		this.groupName = groupName;
		this.describeGroup = describeGroup;
	}

}
