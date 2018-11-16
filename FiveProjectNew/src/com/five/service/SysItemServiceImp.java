package com.five.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.dao.SysItemDao;
import com.five.model.SysItemModel;
import com.five.model.SysItemQueryModel;

@Service
public class SysItemServiceImp implements SysItemService{
    
	@Autowired
	private SysItemDao sysItemDao;

	@Override
	public List<SysItemModel> findAll() {
		return sysItemDao.findAll();
	}

	@Override
	public SysItemModel findById(int itemId) {
		return sysItemDao.findById(itemId);
	}

	@Override
	public List<SysItemModel> findByConditons(SysItemQueryModel sq) {
		return sysItemDao.findByConditons(sq);
	}

	@Override
	public int add(SysItemModel s) {
		return sysItemDao.add(s);
	}

	@Override
	public int del(int itemId) {
		return sysItemDao.del(itemId);
	}

	@Override
	public int upd(SysItemModel s) {
		return sysItemDao.upd(s);
	}
	
	
	

}
