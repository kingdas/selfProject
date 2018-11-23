package com.three.claManage.service;

import java.util.List;

import com.three.claManage.model.SysWorkShift;

public interface ShiftService {

	int add(SysWorkShift sws);

	int delete(int n);

	int update(SysWorkShift sws);

	SysWorkShift findById(int n);

	List<SysWorkShift> findByCondition(SysWorkShift sws);

	List<SysWorkShift> findAll();
}
