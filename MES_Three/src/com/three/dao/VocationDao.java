package com.three.dao;

import java.util.List;

import com.three.model.VocationModel;

public interface VocationDao {
	int add(VocationModel u);

	int del(int HolidayId);

	int update(VocationModel u);

	VocationModel findById(int HolidayId);

	List<VocationModel> findByCondition(VocationModel u);

	List<VocationModel> findAll();
}
