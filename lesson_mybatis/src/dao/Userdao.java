package dao;

import java.util.List;

import base.BaseDao;

public interface Userdao extends BaseDao<User> {
	List<User> findAllAll();
}
