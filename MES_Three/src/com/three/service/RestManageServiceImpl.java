package com.three.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.three.dao.RestManageDao;
import com.three.model.SysWorkRest;

@Service
public class RestManageServiceImpl implements RestManageService {
	@Autowired
	RestManageDao rmDao;

	@Override
	public int add(SysWorkRest swr) {
		return rmDao.add(swr);
	}

	@Override
	public int update(SysWorkRest swr) {
		return rmDao.update(swr);
	}

	@Override
	public int del(int restId) {
		return rmDao.del(restId);
	}

	@Override
	public List<SysWorkRest> findAll() {
		return rmDao.findAll();
	}

	@Override
	public List<SysWorkRest> findByCondition(SysWorkRest swr) {
		return rmDao.findByCondition(swr);
	}

	@Override
	public SysWorkRest findById(int restId) {
		return rmDao.findById(restId);
	}

}
