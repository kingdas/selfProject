package com.three.service;
import java.util.List;

import com.three.model.SysWorkRest;

public interface RestManageService {
	int add(SysWorkRest swr);

	int update(SysWorkRest swr);

	int del(int restId);

	List<SysWorkRest> findAll();

	List<SysWorkRest> findByCondition(SysWorkRest swr);

	SysWorkRest findById(int restId);
}
