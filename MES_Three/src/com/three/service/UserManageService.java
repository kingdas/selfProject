package com.three.service;

import java.util.List;

import com.three.model.UserModel;

public interface UserManageService {
	int add(UserModel user);

	int delete(int n);

	int update(UserModel user);

	UserModel findById(int n);

	List<UserModel> findByCondition(UserModel user);

	List<UserModel> findAll();
}
