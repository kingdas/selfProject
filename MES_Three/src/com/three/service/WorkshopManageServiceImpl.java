package com.three.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.three.dao.WorkshopManageDao;
import com.three.model.WorkshopManageModel;

@Service
public class WorkshopManageServiceImpl implements WorkshopManageService {
	@Autowired
	private WorkshopManageDao wDao;

	@Override
	public int add(WorkshopManageModel w) {

		return wDao.add(w);
	}

	@Override
	public int update(WorkshopManageModel w) {

		return wDao.update(w);
	}

	@Override
	public int del(int shopId) {

		return wDao.del(shopId);
	}

	@Override
	public WorkshopManageModel findById(int shopId) {

		return wDao.findById(shopId);
	}

	@Override
	public List<WorkshopManageModel> findByCondition(WorkshopManageModel w) {

		return wDao.findByCondition(w);
	}

	@Override
	public List<WorkshopManageModel> findAll() {

		return wDao.findAll();
	}

}
