package com.five.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.five.model.AlarmModel;
import com.five.model.AlarmQuary;

public interface AlarmService {
	
	int add(AlarmModel am);

	int del(int reasonId);

	int update(AlarmModel am);

	AlarmModel  findById(int reasonId );

	 List<AlarmModel> findReasonId();//获取总记录数
	//List<ChejianModel> findAll();
	
	 List<AlarmModel> findAll(@Param("offset") int offset, @Param("limit") int limit);
	
	List<AlarmModel> findByReAndDe(AlarmQuary aq);//通过车间名称和车间主管查�?

	
}
