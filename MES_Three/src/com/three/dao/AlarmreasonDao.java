package com.three.dao;

import java.util.List;

import com.three.model.AlarmreasonModel;

public interface AlarmreasonDao {

	int add(AlarmreasonModel a);

	int del(int reasonId);

	int update(AlarmreasonModel a);

	AlarmreasonModel findById(int reasonId);

	List<AlarmreasonModel> findAll();

	List<AlarmreasonModel> findByCondition(AlarmreasonModel a);

}
