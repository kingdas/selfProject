package com.three.dao;

import java.util.List;

import com.three.model.SysWorkRest;

public interface RestManageDao {
	List<SysWorkRest> findAll();

	List<SysWorkRest> findByCondition(SysWorkRest swr);

	int add(SysWorkRest swr);

	int update(SysWorkRest swr);

	int del(int restId);

	SysWorkRest findById(int restId);
}
