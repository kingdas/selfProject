package dao;

import user.User;
import user.UserQuery;

import java.util.List;

public class Daoimplement implements Userdao {

	@Override
	public int add(User u) {
		String sql = "insert into user5(operator_id,name,password,status)values(" + u.getOperator_id() + ",'"
				+ u.getName() + "','" + u.getPassword() + "'," + u.getStatus() + ");";
		return Mydbutils.executeCUD(sql);
	}

	@Override
	public int update(User u) {
		String sql = "update user5 set name = '" + u.getName() + "',password = '" + u.getPassword() + "',status="
				+ u.getStatus() + " where operator_id = " + u.getOperator_id() + ";";
		return Mydbutils.executeCUD(sql);
	}

	@Override
	public int delete(int id) {
		String sql = "delete from user5 where operator_id = " + id + ";";
		return Mydbutils.executeCUD(sql);
	}

	@Override
	public User findById(int id) {
		String sql = "select * from user5 where operator_id = " + id + ";";
		List<User> lis = Mydbutils.executeR(sql, User.class);
		if (lis.size() > 0) {
			return lis.get(0);
		}
		return null;
	}

	@Override
	public List<User> findAll() {
		return findByCondition(null);
	}

	@Override
	public List<User> findByCondition(UserQuery uq) {
		String sql = "select * from user5 where 1 = 1";
		if (uq != null) {
			if (uq.getStatus() == null) {
				if (uq.getName() != null) {
					sql += " and name like '%" + uq.getName() + "%'";
				}
			} else {
				if (uq.getName() != null && uq.getName().trim().length() > 0) {
					sql += " and name like '%" + uq.getName() + "%'";
				}
				if (uq.getStatus() != -1) {
					sql += " and status = " + uq.getStatus();
				}
			}
		}
//		System.out.println(sql);
		List<User> li = Mydbutils.executeR(sql, User.class);
		return li;
	}

//	public static void main(String[] args) {
//		Daoimplement userDao = new Daoimplement();
//		User li = userDao.findById(3);
//		System.out.println(li);
//	}

}
