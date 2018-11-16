package com.five.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.five.model.SysWorkLiner;

public interface LinerService {
	int add(SysWorkLiner swl);

	int delete(int c);

	int update(SysWorkLiner swl);

	SysWorkLiner findById(int c);

	List<SysWorkLiner> findByCondition(SysWorkLiner swls);

	// int findRowsCountByCondition(SysWorkLiner swls);

	List<SysWorkLiner> findAll(@Param("startRow") int startRow, @Param("limitNo") int limitNo);

	int findRowsCount();
}
