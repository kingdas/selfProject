package com.three.service;

import java.util.List;

import com.three.model.WorkLinerModel;

public interface WorkLinerService {
	int add(WorkLinerModel syw);

	int del(int id);

	int upd(WorkLinerModel syw);

	List<WorkLinerModel> findAll();

	List<WorkLinerModel> findByCondition(WorkLinerModel syw);

	WorkLinerModel findById(int id);
}
