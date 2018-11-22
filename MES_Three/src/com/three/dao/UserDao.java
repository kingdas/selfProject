package com.three.dao;

import java.util.List;

import com.three.base.BaseDao;
import com.three.model.UserModle;

public interface UserDao extends BaseDao<UserModle> {
	UserModle findLogin(UserModle u);

	UserModle findId(int userId);

	List<UserModle> findbyCondition(UserModle u);
}