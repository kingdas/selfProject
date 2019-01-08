package com.yc.framework;

import java.util.List;

public interface BaseService<M> {
	void add(M m);

	void del(int id);

	void update(M m);

	M findById(int id);

	List<M> findAll();

}
