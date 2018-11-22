package com.three.service;

import java.util.List;

import com.three.model.VocationModel;

public interface VocationService {
	int add(VocationModel u);

	int del(int holidayId);

	int update(VocationModel u);

	VocationModel findById(int holidayId);

	List<VocationModel> findByCondition(VocationModel uq);

	List<VocationModel> findAll();
}
