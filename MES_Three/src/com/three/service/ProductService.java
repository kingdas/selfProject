package com.three.service;
import java.util.List;

import com.three.model.ProductModel;

/**
 * ��Ʒservice
 * 
 * @author Administrator
 * 
 */
public interface ProductService {
	// ��ѯ���еĲ�Ʒ��Ϣ
	List<ProductModel> findProductAll();

	// ͨ����Ʒ���롢��Ʒ��������Դ��ѯ��Ʒ��Ϣ
	List<ProductModel> findByCodeOrDesOrSource(ProductModel pm);

	// ��Ӳ�Ʒ��Ϣ
	int add(ProductModel pm);

	// ɾ����Ʒ��Ϣ
	int del(int itemId);

	// ͨ��itemId���Ҳ�Ʒ��Ϣ
	ProductModel findByitemId(int itemId);

	// �޸Ĳ�Ʒ��Ϣ
	int update(ProductModel pm);
}
