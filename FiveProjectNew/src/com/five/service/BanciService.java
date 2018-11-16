package com.five.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.five.model.BanciModel;



public interface BanciService {
	int add(BanciModel bm);

	int del(int shiftid);

	int update(BanciModel bm);

	BanciModel FindById(int shiftid);

	List<BanciModel> FindAll(@Param("offset") int offset,
			@Param("limit") int limit);

	List<BanciModel> FindByCondition(BanciModel bm);

	int FindAllNum();
}
