package com.yc.menuSys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.framework.BaseDao;
import com.yc.framework.BaseServiceImpl;
import com.yc.menuSys.dao.OrderDao;
import com.yc.menuSys.model.Order;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order> implements
		OrderService {

	@Autowired
	private OrderDao orderDao;

	@Override
	public BaseDao<Order> getDao() {
		return orderDao;
	}

}
