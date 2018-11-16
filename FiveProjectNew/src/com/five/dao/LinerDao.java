package com.five.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.five.base.BaseDao;
import com.five.model.SysWorkLiner;

public interface LinerDao extends BaseDao<SysWorkLiner> {
	List<SysWorkLiner> findAll(@Param("startRow") int startRow, @Param("limitNo") int limitNo);

	int findRowsCount();

	List<SysWorkLiner> findByCondition(SysWorkLiner swls);

	//int findRowsCountByCondition(SysWorkLiner swls);
}
