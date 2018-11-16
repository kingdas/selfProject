package com.five.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.dao.GroupDao;
import com.five.model.GroupModel;
import com.five.model.GroupQueryModel;

@Service
public class GroupServiceImp implements GroupService{
    
	@Autowired
	private GroupDao groupDao;
	
	@Override
	public List<GroupModel> findAll() {
		return groupDao.findAll();
	}

	@Override
	public List<GroupModel> findByConditons(GroupQueryModel gq) {
		return groupDao.findByConditons(gq);
	}

	@Override
	public int add(GroupModel g) {
		return groupDao.add(g);
	}

	@Override
	public int del(int groupId) {
		return groupDao.del(groupId);
	}

	@Override
	public int upd(GroupModel g) {
		return groupDao.upd(g);
	}

	@Override
	public GroupModel findById(int groupId) {
		return groupDao.findById(groupId);
	}
	

}
