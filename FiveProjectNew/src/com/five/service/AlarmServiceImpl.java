package com.five.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.dao.AlarmDao;
import com.five.model.AlarmModel;
import com.five.model.AlarmQuary;

@Service
public class AlarmServiceImpl  implements AlarmService{

	@Autowired
	private AlarmDao alarmDao;
	@Override
	public List<AlarmModel> findByReAndDe(AlarmQuary aq){
		return alarmDao.findByCondiction(aq);
	}

	@Override
	public int update(AlarmModel am) {
		// TODO Auto-generated method stub
		return alarmDao.update(am);
	}

	@Override
	public int add(AlarmModel am) {
		// TODO Auto-generated method stub
		return alarmDao.add(am);
	}
	
@Override
	public int del(int reasonId) {
		// TODO Auto-generated method stub
		return alarmDao.del(reasonId);
	}

	@Override
	public AlarmModel findById(int reasonId) {
		// TODO Auto-generated method stub
		return alarmDao.findById(reasonId);
	}

	@Override
	public List<AlarmModel> findAll(int offset, int limit) {
		// TODO Auto-generated method stub
		return alarmDao.findAll(offset, limit);
	}

	@Override
	public List<AlarmModel> findReasonId() {
		// TODO Auto-generated method stub
		return alarmDao.findReasonId();
	}

	

	

}
