package com.yc.framework;

import java.util.List;

public interface BaseService<T> {
	int add(T t);

	int update(T t);

	int del(int id);

	T findById(int id);

	List<T> findByCondition(T t);

	List<T> findAll();
}
