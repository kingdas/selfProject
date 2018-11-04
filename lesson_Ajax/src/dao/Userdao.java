package dao;

import java.util.List;

import user.User;
import user.UserQuery;

public interface Userdao {
	int add(User u);

	int update(User u);

	int delete(int id);

	User findById(int id);

	List<User> findAll();

	List<User> findByCondition(UserQuery uq);

}