package com.five.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.dao.ChejianDao;
import com.five.model.ChejianModel;
import com.five.model.ChejianQuary;
@Service
public class ChejianServiceImpl  implements ChejianService{

	@Autowired
	private ChejianDao chejianDao;
	@Override
	public List<ChejianModel> findByNaAndAdmin(ChejianQuary cq){
		return chejianDao.findByCondiction(cq);
	}

	@Override
	public int update(ChejianModel cm) {
		// TODO Auto-generated method stub
		return chejianDao.update(cm);
	}

	@Override
	public int add(ChejianModel cm) {
		// TODO Auto-generated method stub
		return chejianDao.add(cm);
	}
	
@Override
	public int del(int shopId) {
		// TODO Auto-generated method stub
		return chejianDao.del(shopId);
	}

	@Override
	public ChejianModel findById(int shopId) {
		// TODO Auto-generated method stub
		return chejianDao.findById(shopId);
	}

	@Override
	public List<ChejianModel> findAll(int offset, int limit) {
		// TODO Auto-generated method stub
		return chejianDao.findAll(offset, limit);
	}

	@Override
	public List<ChejianModel> findShopId() {
		// TODO Auto-generated method stub
		return chejianDao.findShopId();
	}

	

	

}
