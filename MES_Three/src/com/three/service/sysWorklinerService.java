package com.three.service;
import java.util.List;

import com.three.model.sysWorkLinerModel;

public interface sysWorklinerService {
	int add(sysWorkLinerModel syw);

	int del(int id);

	int upd(sysWorkLinerModel syw);

	List<sysWorkLinerModel> findAll();

	List<sysWorkLinerModel> findByCondition(sysWorkLinerModel syw);

	sysWorkLinerModel findById(int id);
}
