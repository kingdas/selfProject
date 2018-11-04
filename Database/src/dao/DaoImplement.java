package dao;

import java.util.List;

public class DaoImplement implements UserDao {

	public int add(User u) {
		// TODO Auto-generated method stub
		String sql = "insert into user3 (name,groupid) values ('" + u.getName()
				+ "'," + u.getGroupid() + ");";
		return Dbutils.executeCUD(sql);
	}

	public int update(User u) {
		// TODO Auto-generated method stub
		String sql = "update user3 set name = '" + u.getName() + "',groupid = "
				+ u.getGroupid() + " where id = " + u.getId() + ";";
		return Dbutils.executeCUD(sql);
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from user3 where id = " + id + ";";
		return Dbutils.executeCUD(sql);
	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from user3 where id = " + id + ";";
		List<User> li = Dbutils.executeR(sql, User.class);
		if (li.size() > 0) {
			return li.get(0);
		} else
			return null;
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from user3;";
		List<User> li = Dbutils.executeR(sql, User.class);
		return li;
	}

}
