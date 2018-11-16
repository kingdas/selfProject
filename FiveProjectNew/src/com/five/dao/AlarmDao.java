package com.five.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.five.model.AlarmModel;
import com.five.model.AlarmQuary;

public interface AlarmDao  {
	int add(AlarmModel am);

    int del(int reasonId);

    int update(AlarmModel am);

    AlarmModel  findById(int reasonId );

    //List<ChejianModel> findAll();
    
    List<AlarmModel> findAll(@Param("offset") int offset, @Param("limit") int limit); //分页

    List<AlarmModel> findByCondiction(AlarmQuary aq);//条件查询
	
   List<AlarmModel> findReasonId(); //获取总记录数
   
  
}
