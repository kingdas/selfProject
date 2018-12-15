package com.yc.menuSys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.framework.BaseDao;
import com.yc.framework.BaseServiceImpl;
import com.yc.menuSys.dao.OrderItemDao;
import com.yc.menuSys.model.OrderItem;

@Service
public class OrderItemServiceImpl extends BaseServiceImpl<OrderItem> implements
		OrderItemService {

	@Autowired
	private OrderItemDao orderItemDao;

	@Override
	public BaseDao<OrderItem> getDao() {
		return orderItemDao;
	}

}
