package com.yc.menuSys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.framework.BaseDao;
import com.yc.framework.BaseServiceImpl;
import com.yc.menuSys.dao.MenuDao;
import com.yc.menuSys.model.Menu;

@Service
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements
		MenuService {

	@Autowired
	private MenuDao menuDao;

	@Override
	public BaseDao<Menu> getDao() {
		return menuDao;
	}

}
