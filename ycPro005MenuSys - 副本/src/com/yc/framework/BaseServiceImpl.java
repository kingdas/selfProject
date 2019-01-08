package com.yc.framework;

import java.util.List;

public abstract class BaseServiceImpl<M> implements BaseService<M> {

	public abstract BaseDao<M> getDao();

	@Override
	public void add(M m) {
		getDao().add(m);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(M m) {
		// TODO Auto-generated method stub

	}

	@Override
	public M findById(int id) {
		return getDao().findById(id);
	}

	@Override
	public List<M> findAll() {
		return getDao().findAll();
	}

}
