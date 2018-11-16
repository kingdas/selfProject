package com.five.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.five.model.RoleModel;

public interface RoleDao {
	int del(Integer id);

	int add(RoleModel m);

	int update(RoleModel m);
	
	RoleModel findbyid(Integer id);

	List<RoleModel> findall(@Param("offset") int offset, @Param("limit") int limit);
	
	List<RoleModel> findall2(@Param("offset") int offset, @Param("limit") int limit);

	List<RoleModel> findByCondition(RoleModel m);
	
	List<RoleModel> findid();
}
