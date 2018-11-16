package com.five.service;

import java.util.List;

import com.five.model.SysItemModel;
import com.five.model.SysItemQueryModel;

public interface SysItemService {
	List<SysItemModel> findAll();
    SysItemModel findById(int itemId);
    List<SysItemModel> findByConditons(SysItemQueryModel sq);
    int add(SysItemModel s);
    int del(int itemId);
    int upd(SysItemModel s);
}
