package com.three.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.three.dao.VocationDao;
import com.three.model.VocationModel;

@Service
public class VocationServiceImp implements VocationService {
	@Autowired
	private VocationDao vocationDao;

	@Override
	public int add(VocationModel u) {
		return vocationDao.add(u);
	}

	@Override
	public int del(int holidayId) {
		return vocationDao.del(holidayId);
	}

	@Override
	public int update(VocationModel u) {
		return vocationDao.update(u);
	}

	@Override
	public VocationModel findById(int holidayId) {
		return vocationDao.findById(holidayId);
	}

	@Override
	public List<VocationModel> findByCondition(VocationModel uq) {
		System.out.println(uq);
		return vocationDao.findByCondition(uq);
	}

	@Override
	public List<VocationModel> findAll() {
		return vocationDao.findAll();
	}

}
