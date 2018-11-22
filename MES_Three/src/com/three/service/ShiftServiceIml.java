package com.three.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.three.dao.ShiftDao;
import com.three.model.SysWorkShift;

@Service
public class ShiftServiceIml implements ShiftService {

	@Autowired
	ShiftDao shiftDao;

	@Override
	public int add(SysWorkShift sws) {
		return shiftDao.add(sws);
	}

	@Override
	public int delete(int n) {
		return shiftDao.delete(n);
	}

	@Override
	public int update(SysWorkShift sws) {
		return shiftDao.update(sws);
	}

	@Override
	public SysWorkShift findById(int n) {
		return shiftDao.findById(n);
	}

	@Override
	public List<SysWorkShift> findByCondition(SysWorkShift sws) {
		return shiftDao.findByCondition(sws);
	}

	@Override
	public List<SysWorkShift> findAll() {
		return shiftDao.findAll();
	}

}
