package com.five.jin.base;

import java.util.List;

public interface BaseDao<T> {
	int add(T t);

	int delete(int c);

	int update(T t);

	T findById(int c);

	List<T> findByCondition(T t);

	List<T> findAll();
}
