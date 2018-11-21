package com.five.jin.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.jin.dao.LinerDao;
import com.five.jin.model.SysWorkLiner;

@Service
public class LinerServiceIml implements LinerService {

	@Autowired
	LinerDao linerDao;

	@Override
	public int add(SysWorkLiner swl) {
		return linerDao.add(swl);
	}

	@Override
	public int delete(int c) {
		return linerDao.delete(c);
	}

	@Override
	public int update(SysWorkLiner swl) {
		return linerDao.update(swl);
	}

	@Override
	public SysWorkLiner findById(int c) {
		return linerDao.findById(c);
	}

	@Override
	public List<SysWorkLiner> findByCondition(SysWorkLiner swls) {
		return linerDao.findByCondition(swls);
	}

//	@Override
//	public int findRowsCountByCondition(SysWorkLiner swls) {
//		return linerDao.findRowsCountByCondition(swls);
//	}

	@Override
	public List<SysWorkLiner> findAll(@Param("startRow") int startRow, @Param("limitNo") int limitNo) {
		return linerDao.findAll(startRow, limitNo);
	}

	@Override
	public int findRowsCount() {
		return linerDao.findRowsCount();
	}

}
