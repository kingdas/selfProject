package com.three.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.three.dao.UserDao;
import com.three.model.UserModel;

@Service
public class UserManageServiceImpl implements UserManageService {

	@Autowired
	private UserDao userDao;

	@Override
	public int add(UserModel user) {
		return userDao.add(user);
	}

	@Override
	public int delete(int n) {
		return userDao.delete(n);
	}

	@Override
	public int update(UserModel user) {
		return userDao.update(user);
	}

	@Override
	public UserModel findById(int n) {
		return userDao.findById(n);
	}

	@Override
	public List<UserModel> findByCondition(UserModel user) {
		return userDao.findByCondition(user);
	}

	@Override
	public List<UserModel> findAll() {
		return userDao.findAll();
	}

}
