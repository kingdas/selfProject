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
		// TODO Auto-generated method stub
		return positionManageDao.del(placeId);
	}

	@Override
	public int update(PositionManage pm) {
		// TODO Auto-generated method stub
		return positionManageDao.update(pm);
	}

	@Override
	public int add(PositionManage pm) {
		// TODO Auto-generated method stub
		return positionManageDao.add(pm);
	}

	@Override
	public PositionManage findById(int placeId) {
		// TODO Auto-generated method stub
		return positionManageDao.findById(placeId);
	}

	@Override
	public List<PositionManage> findByCondition(PositionManage pm) {
		// TODO Auto-generated method stub
		return positionManageDao.findByCondition(pm);
	}

	@Override
	public List<PositionManage> findAll() {
		// TODO Auto-generated method stub
		return positionManageDao.findAll();
	}

}
