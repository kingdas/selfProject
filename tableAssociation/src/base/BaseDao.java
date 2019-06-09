package base;

import java.util.List;

public interface BaseDao<T> {
	int add(T u);

	int update(T u);

	int delete(int id);

	T findById(int id);

	List<T> findAll();
}
