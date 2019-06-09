package com.three.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.three.dao.PositionManageDao;
import com.three.model.PositionManage;

@Service
public class PositionServiceIml implements PositionService {

	@Autowired
	PositionManageDao positionManageDao;

	@Override
	public int del(int placeId) {
		return positionManageDao.del(placeId);
	}

	@Override
	public int update(PositionManage pm) {
		return positionManageDao.update(pm);
	}

	@Override
	public int add(PositionManage pm) {
		return positionManageDao.add(pm);
	}

	@Override
	public PositionManage findById(int placeId) {
		return positionManageDao.findById(placeId);
	}

	@Override
	public List<PositionManage> findByCondition(PositionManage pm) {
		return positionManageDao.findByCondition(pm);
	}

	@Override
	public List<PositionManage> findAll() {
		return positionManageDao.findAll();
	}

}
