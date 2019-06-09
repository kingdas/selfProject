package com.three.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.three.dao.WorkLinerDao;
import com.three.model.WorkLinerModel;

@Service
public class WorkLinerServiceImp implements WorkLinerService {

	@Autowired
	private WorkLinerDao wlDao;

	@Override
	public int add(WorkLinerModel syw) {
		return wlDao.add(syw);
	}

	@Override
	public int del(int id) {
		return wlDao.delete(id);
	}

	@Override
	public int upd(WorkLinerModel syw) {
		return wlDao.update(syw);
	}

	@Override
	public List<WorkLinerModel> findAll() {
		return wlDao.findAll();
	}

	@Override
	public List<WorkLinerModel> findByCondition(WorkLinerModel syw) {
		return wlDao.findByCondition(syw);
	}

	@Override
	public WorkLinerModel findById(int id) {
		return wlDao.findById(id);
	}
}
