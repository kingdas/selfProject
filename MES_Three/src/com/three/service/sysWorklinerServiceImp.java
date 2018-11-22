package com.three.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.three.dao.sysWorklinerDao;
import com.three.model.sysWorkLinerModel;

@Service
public class sysWorklinerServiceImp implements sysWorklinerService {

	@Autowired
	private sysWorklinerDao sysWorklinerDa;

	@Override
	public int add(sysWorkLinerModel syw) {
		return sysWorklinerDa.add(syw);
	}

	@Override
	public int del(int id) {
		return sysWorklinerDa.delete(id);
	}

	@Override
	public int upd(sysWorkLinerModel syw) {
		return 0;
	}

	@Override
	public List<sysWorkLinerModel> findAll() {
		return sysWorklinerDa.findAll();
	}

	@Override
	public List<sysWorkLinerModel> findByCondition(sysWorkLinerModel syw) {
		return sysWorklinerDa.findByCondition(syw);
	}

	@Override
	public sysWorkLinerModel findById(int id) {
		return sysWorklinerDa.findById(id);
	}
}
