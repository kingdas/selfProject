package com.three.service;
import java.util.List;

import com.three.model.ProductModel;

/**
 * 产品service
 * 
 * @author Administrator
 * 
 */
public interface ProductService {
	// 查询所有的产品信息
	List<ProductModel> findProductAll();

	// 通过产品编码、产品描述和来源查询产品信息
	List<ProductModel> findByCodeOrDesOrSource(ProductModel pm);

	// 添加产品信息
	int add(ProductModel pm);

	// 删除产品信息
	int del(int itemId);

	// 通过itemId查找产品信息
	ProductModel findByitemId(int itemId);

	// 修改产品信息
	int update(ProductModel pm);
}
