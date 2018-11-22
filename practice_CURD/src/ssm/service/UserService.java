package ssm.service;

import java.util.List;

import ssm.user.User;
import ssm.user.UserQuery;

public interface UserService {
	int add(User u);

	int update(User u);

	int delete(int id);

	User findById(int id);

	List<User> findAll();

	boolean findName(String name);

	List<User> findStatusName(UserQuery uq);

}
