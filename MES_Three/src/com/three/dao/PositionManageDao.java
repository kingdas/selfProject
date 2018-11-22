package com.three.dao;

import java.util.List;

import com.three.model.PositionManage;

public interface PositionManageDao {

	int del(int placeId);

	int update(PositionManage pm);

	int add(PositionManage pm);

	PositionManage findById(int placeId);

	List<PositionManage> findByCondition(PositionManage pm);

	List<PositionManage> findAll();
}