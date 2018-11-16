package com.five.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.five.model.ChejianModel;
import com.five.model.ChejianQuary;

public interface ChejianDao  {
	int add(ChejianModel cm);

    int del(int shopId);

    int update(ChejianModel cm);

    ChejianModel  findById(int shopId );

    //List<ChejianModel> findAll();
    
    List<ChejianModel> findAll(@Param("offset") int offset, @Param("limit") int limit); //分页

    List<ChejianModel> findByCondiction(ChejianQuary cq);//条件查询
	
   List<ChejianModel> findShopId(); //获取总记录数
   
  
}
