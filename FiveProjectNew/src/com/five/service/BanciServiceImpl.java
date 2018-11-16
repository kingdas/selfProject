package com.five.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.dao.BanciDao;
import com.five.model.BanciModel;



@Service
public class BanciServiceImpl implements BanciService {

	@Autowired
	private BanciDao bd;

	@Override
	public int add(BanciModel bm) {
		return bd.add(bm);
	}

	@Override
	public int del(int shiftid) {
		return bd.del(shiftid);
	}

	@Override
	public int update(BanciModel bm) {
		return bd.update(bm);
	}

	@Override
	public List<BanciModel> FindAll(@Param("offset") int offset,@Param("limit") int limit) {
		return bd.FindAll(offset,limit);
	}

	@Override
	public List<BanciModel> FindByCondition(BanciModel bm) {
		return bd.FindByCondition(bm);
	}

	@Override
	public BanciModel FindById(int shiftid) {
		return bd.FindById(shiftid);
	}

	@Override
	public int FindAllNum() {
		return bd.FindAllNum();
	}
}
