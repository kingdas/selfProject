package ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.dao.Userdao;
import ssm.user.User;
import ssm.user.UserQuery;

@Service
public class UserServiceImplement implements UserService {
	@Autowired
	Userdao userDao;

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
		if (userDao.findByCondition(uq).size() == 1) {
			return true;
		}
		return false;
	}

	@Override
	public List<User> findStatusName(UserQuery uq) {
		return userDao.findByCondition(uq);
	}

}
