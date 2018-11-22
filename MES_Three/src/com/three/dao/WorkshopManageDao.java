package com.three.dao;

import java.util.List;

import com.three.model.WorkshopManageModel;

public interface WorkshopManageDao {
	int add(WorkshopManageModel w);

	int update(WorkshopManageModel w);

	int del(int shopId);

	WorkshopManageModel findById(int shopId);

	List<WorkshopManageModel> findByCondition(WorkshopManageModel w);

	List<WorkshopManageModel> findbyName(String shopName);

	List<WorkshopManageModel> findAll();

}
