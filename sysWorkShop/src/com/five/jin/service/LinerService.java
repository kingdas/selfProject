package com.five.jin.service;

import java.util.List;

import com.five.jin.model.SysWorkLiner;

public interface LinerService {
	int add(SysWorkLiner swl);

	int delete(int c);

	int update(SysWorkLiner swl);

	SysWorkLiner findById(int c);

	List<SysWorkLiner> findByCondition(SysWorkLiner swls);

	List<SysWorkLiner> findAll();
}
