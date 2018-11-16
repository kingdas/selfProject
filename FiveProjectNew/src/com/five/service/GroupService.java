package com.five.service;

import java.util.List;

import com.five.model.GroupModel;
import com.five.model.GroupQueryModel;

public interface GroupService {
	List<GroupModel> findAll();
	GroupModel findById(int groupId);
    List<GroupModel> findByConditons(GroupQueryModel gq);
    int add(GroupModel g);
    int del(int groupId);
    int upd(GroupModel g);

}
