package com.three.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.three.dao.ProductDao;
import com.three.model.ProductModel;

/**
 * ProductServiceµÄÊµÏÖ
 * 
 * @author Administrator
 * 
 */
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;

	@Override
	public List<ProductModel> findProductAll() {
		return productDao.findProductAll();
	}

	@Override
	public List<ProductModel> findByCodeOrDesOrSource(ProductModel pm) {

		return productDao.findByCondition(pm);
	}

	@Override
	public int add(ProductModel pm) {

		return productDao.add(pm);
	}

	@Override
	public int del(int itemId) {

		return productDao.del(itemId);
	}

	@Override
	public ProductModel findByitemId(int itemId) {

		return productDao.findByitemId(itemId);
	}

	@Override
	public int update(ProductModel pm) {

		return productDao.update(pm);
	}

}
