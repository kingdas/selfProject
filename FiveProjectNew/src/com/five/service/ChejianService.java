package com.five.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.five.model.ChejianModel;
import com.five.model.ChejianQuary;

public interface ChejianService {
	
	int add(ChejianModel cm);

	int del(int shopId);

	int update(ChejianModel cm);

	ChejianModel  findById(int shopId );

	 List<ChejianModel> findShopId();//获取总记录数
	//List<ChejianModel> findAll();
	
	 List<ChejianModel> findAll(@Param("offset") int offset, @Param("limit") int limit);
	
	List<ChejianModel> findByNaAndAdmin(ChejianQuary cq);//通过车间名称和车间主管查�?

	
}
