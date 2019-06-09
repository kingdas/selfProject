package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Testbatis {
	public static void main(String[] args) {
		Userdao userDao = new DaoMybatisImplement();
		List<User> li = userDao.findAll();
		System.out.println(li);
		// int n = userDao.add(new User("xx",1));
		// System.out.println(n);
		// User u = userDao.findById(1);
		// System.out.println(u);

		// int n = 0;
		// n = userDao.delete(9);
		// System.out.println(n);
		// /////////////////////////////////////////////////
		// SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(Thread
		// .currentThread().getContextClassLoader()
		// .getResourceAsStream("mybatis.xml"));
		//
		// SqlSession s = sf.openSession();
		// List<User> li = s.selectList("dao.Userdao.findAll");
		// System.out.println(li);

		// User u = s.selectOne("dao.Userdao.findById", 1);
		// System.out.println(u);

		// User u = new User("xx", 1);
		// int n = 0;
		// try {
		// n = s.insert("dao.Userdao.add", u);
		// s.commit();
		// } catch (Exception e) {
		// e.printStackTrace();
		// s.rollback();
		// } finally {
		// s.close();
		// }
		// System.out.println(n);
	}
}
