package dao;

import group.Group;
import group.GroupDao;
import group.GroupDaoImplement;

import java.util.List;

public class Daoimplement implements Userdao {

	@Override
	public int add(User u) {
		String sql = null;
		if (u.getId() != null) {
			sql = "insert into user1(id,name,groupid)values(" + u.getId()
					+ ",'" + u.getName() + "'," + u.getGroupid() + ");";
		} else
			sql = "insert into user1 (name,groupid)values('" + u.getName()
					+ "'," + u.getGroupid() + ");";
		return Mydbutils.executeCUD(sql);
	}

	@Override
	public int update(User u) {
		String sql = "update user1 set name = '" + u.getName() + "',groupid = "
				+ u.getGroupid() + " " + "where id = " + u.getId() + ";";
		return Mydbutils.executeCUD(sql);
	}

	@Override
	public int delete(int id) {
		String sql = "delete from user1 where id = " + id + ";";
		return Mydbutils.executeCUD(sql);
	}

	@Override
	public User findById(int id) {
		// String sql =
		// "select u.id,u.name,u.groupid,g.groupname from (select * from user1 where id = "
		// + id + ") u,group1 g where u.groupid = g.id;";
		String sql = "select * from user1 where id = " + id + ";";
		List<User> lis = Mydbutils.executeR(sql, User.class);
		return lis.get(0);
	}

	@Override
	public List<User> findAll() {
		// String sql =
		// "select u.id,u.name,u.groupid,g.groupname from user1 u,group1 g where u.groupid = g.id;";
		String sql = "select * from user1;";
		return Mydbutils.executeR(sql, User.class);
	}

	public List<User> findAllAll() {
		GroupDao groupDao = new GroupDaoImplement();
		String sql = "select * from user1;";
		List<User> li = Mydbutils.executeR(sql, User.class);
		User u = null;
		Group g = null;
		for (int i = 0; i < li.size(); i++) {
			u = li.get(i);
			g = groupDao.findById(u.getGroupid());
			u.setGroup(g);
		}
		return li;
	}

	// public static void main(String[] args) {
	// Daoimplement userDao = new Daoimplement();
	// List<User> li = userDao.findAll();
	// System.out.println(li);
	// }

}
