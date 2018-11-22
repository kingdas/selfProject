package com.three.base;

import java.util.List;

public interface BaseDao<T> {
	int add(T t);

	int delete(int n);

	int update(T t);

	T findById(int n);

	List<T> findByCondition(T t);

	List<T> findAll();
}
