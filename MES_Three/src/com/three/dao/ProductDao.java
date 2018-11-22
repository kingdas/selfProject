package com.three.dao;

import java.util.List;

import com.three.model.ProductModel;

/**
 * ��Ʒdao
 * 
 * @author Administrator
 * 
 */
public interface ProductDao {
	// ��ѯ���еĲ�Ʒ��Ϣ
	List<ProductModel> findProductAll();

	// �������Ĳ�ѯ
	List<ProductModel> findByCondition(ProductModel pm);

	// ��Ӳ�Ʒ��Ϣ
	int add(ProductModel pm);

	// ɾ����Ʒ��Ϣ
	int del(int itemId);

	// ͨ��itemId���Ҳ�Ʒ��Ϣ
	ProductModel findByitemId(int itemId);

	// �޸Ĳ�Ʒ��Ϣ
	int update(ProductModel pm);

}
