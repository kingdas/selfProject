package com.three.model;
public class UserModle {
private int userId;
private String userCode;
private String userPassword;
private String userName;
private String userJob;
private String userEmail;
private String userMobile;
private String userWxnd;
private String userGroup;
private String userRole;
private String isLoginer;
private String isLockPlace;
private String lockPlaceId;
private String createUser;
private String createTime;
private String lastUpdateUser;
private String lastUpdateTime;
private String lastLoginTime;
private String lastLoginoutTime;
public UserModle() {
	
}

public UserModle(String userCode, String userPassword, String userName,
		String userJob, String userEmail, String userMobile, String userWxnd,
		String userGroup, String userRole, String isLoginer,
		String isLockPlace, String lockPlaceId, String createUser,
		String createTime, String lastUpdateUser, String lastUpdateTime,
		String lastLoginTime, String lastLoginoutTime) {
	super();
	this.userCode = userCode;
	this.userPassword = userPassword;
	this.userName = userName;
	this.userJob = userJob;
	this.userEmail = userEmail;
	this.userMobile = userMobile;
	this.userWxnd = userWxnd;
	this.userGroup = userGroup;
	this.userRole = userRole;
	this.isLoginer = isLoginer;
	this.isLockPlace = isLockPlace;
	this.lockPlaceId = lockPlaceId;
	this.createUser = createUser;
	this.createTime = createTime;
	this.lastUpdateUser = lastUpdateUser;
	this.lastUpdateTime = lastUpdateTime;
	this.lastLoginTime = lastLoginTime;
	this.lastLoginoutTime = lastLoginoutTime;
}

public UserModle(int userId, String userCode, String userPassword,
		String userName, String userJob, String userEmail, String userMobile,
		String userWxnd, String userGroup, String userRole, String isLoginer,
		String isLockPlace, String lockPlaceId, String createUser,
		String createTime, String lastUpdateUser, String lastUpdateTime,
		String lastLoginTime, String lastLoginoutTime) {
	super();
	this.userId = userId;
	this.userCode = userCode;
	this.userPassword = userPassword;
	this.userName = userName;
	this.userJob = userJob;
	this.userEmail = userEmail;
	this.userMobile = userMobile;
	this.userWxnd = userWxnd;
	this.userGroup = userGroup;
	this.userRole = userRole;
	this.isLoginer = isLoginer;
	this.isLockPlace = isLockPlace;
	this.lockPlaceId = lockPlaceId;
	this.createUser = createUser;
	this.createTime = createTime;
	this.lastUpdateUser = lastUpdateUser;
	this.lastUpdateTime = lastUpdateTime;
	this.lastLoginTime = lastLoginTime;
	this.lastLoginoutTime = lastLoginoutTime;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserCode() {
	return userCode;
}

public void setUserCode(String userCode) {
	this.userCode = userCode;
}

public String getUserPassword() {
	return userPassword;
}

public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getUserJob() {
	return userJob;
}

public void setUserJob(String userJob) {
	this.userJob = userJob;
}

public String getUserEmail() {
	return userEmail;
}

public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}

public String getUserMobile() {
	return userMobile;
}

public void setUserMobile(String userMobile) {
	this.userMobile = userMobile;
}

public String getUserWxnd() {
	return userWxnd;
}

public void setUserWxnd(String userWxnd) {
	this.userWxnd = userWxnd;
}

public String getUserGroup() {
	return userGroup;
}

public void setUserGroup(String userGroup) {
	this.userGroup = userGroup;
}

public String getUserRole() {
	return userRole;
}

public void setUserRole(String userRole) {
	this.userRole = userRole;
}

public String getIsLoginer() {
	return isLoginer;
}

public void setIsLoginer(String isLoginer) {
	this.isLoginer = isLoginer;
}

public String getIsLockPlace() {
	return isLockPlace;
}

public void setIsLockPlace(String isLockPlace) {
	this.isLockPlace = isLockPlace;
}

public String getLockPlaceId() {
	return lockPlaceId;
}

public void setLockPlaceId(String lockPlaceId) {
	this.lockPlaceId = lockPlaceId;
}

public String getCreateUser() {
	return createUser;
}

public void setCreateUser(String createUser) {
	this.createUser = createUser;
}

public String getCreateTime() {
	return createTime;
}

public void setCreateTime(String createTime) {
	this.createTime = createTime;
}

public String getLastUpdateUser() {
	return lastUpdateUser;
}

public void setLastUpdateUser(String lastUpdateUser) {
	this.lastUpdateUser = lastUpdateUser;
}

public String getLastUpdateTime() {
	return lastUpdateTime;
}

public void setLastUpdateTime(String lastUpdateTime) {
	this.lastUpdateTime = lastUpdateTime;
}

public String getLastLoginTime() {
	return lastLoginTime;
}

public void setLastLoginTime(String lastLoginTime) {
	this.lastLoginTime = lastLoginTime;
}

public String getLastLoginouTime() {
	return lastLoginoutTime;
}

public void setLastLoginouTime(String lastLoginouTime) {
	this.lastLoginoutTime = lastLoginouTime;
}

@Override
public String toString() {
	return "UserModle [userId=" + userId + ", userCode=" + userCode
			+ ", userPassword=" + userPassword + ", userName=" + userName
			+ ", userJob=" + userJob + ", userEmail=" + userEmail
			+ ", userMobile=" + userMobile + ", userWxnd=" + userWxnd
			+ ", userGroup=" + userGroup + ", userRole=" + userRole
			+ ", isLoginer=" + isLoginer + ", isLockPlace=" + isLockPlace
			+ ", lockPlaceId=" + lockPlaceId + ", createUser=" + createUser
			+ ", createTime=" + createTime + ", lastUpdateUser="
			+ lastUpdateUser + ", lastUpdateTime=" + lastUpdateTime
			+ ", lastLoginTime=" + lastLoginTime + ", lastLoginouTime="
			+ lastLoginoutTime + "]";
}

}
