package com.five.base;

import java.util.List;

public interface LylBaseDao<T> {
	List<T> findAll();
    T findById(int id);
    int add(T t);
    int del(int id);
    int upd(T t);
}
