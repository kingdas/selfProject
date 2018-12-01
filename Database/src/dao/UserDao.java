package dao;

import java.util.List;

public interface UserDao {
	int add(User u);
	int update(User u);
	int delete(int id);
	
	User findById(int id);
	
	List<User> findAll();
	
}
