package ssmwork.ssm_dao;

import java.util.List;

import ssmwork.base.BaseDao;
import ssmwork.ssm_model.User;


public interface Userdao extends BaseDao<User> {
	List<User> findAllAll();
}
