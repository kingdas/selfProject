package ssm.dao;

import java.util.List;

import ssm.model.OrderModel;

public interface OrderDao {
	int add(OrderModel om);

	int delete(Integer id);

	List<OrderModel> findAll();

}
