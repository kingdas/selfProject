package service;

import java.util.List;

import dao.Daoimplement;
import dao.Userdao;
import user.User;
import user.UserQuery;

public class UserServiceImplement implements UserService {
	private Userdao userDao = new Daoimplement();

	@Override
	public int add(User u) {
		return userDao.add(u);
	}

	@Override
	public int update(User u) {
		return userDao.update(u);
	}

	@Override
	public int delete(int id) {
		return userDao.delete(id);
	}

	@Override
	public User findById(int id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public boolean findName(String name) {
		UserQuery uq = new UserQuery();
		uq.setName(name);
		List<User> li = userDao.findByCondition(uq);
		if (li != null && li.size() == 1) {
			return true;
		}
		return false;
	}

	@Override
	public List<User> findStatusName(UserQuery uq) {
		return userDao.findByCondition(uq);
	}

}
