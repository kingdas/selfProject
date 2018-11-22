package com.three.dao;

import java.util.List;

import com.three.model.ProductModel;

/**
 * 产品dao
 * 
 * @author Administrator
 * 
 */
public interface ProductDao {
	// 查询所有的产品信息
	List<ProductModel> findProductAll();

	// 有条件的查询
	List<ProductModel> findByCondition(ProductModel pm);

	// 添加产品信息
	int add(ProductModel pm);

	// 删除产品信息
	int del(int itemId);

	// 通过itemId查找产品信息
	ProductModel findByitemId(int itemId);

	// 修改产品信息
	int update(ProductModel pm);

}
