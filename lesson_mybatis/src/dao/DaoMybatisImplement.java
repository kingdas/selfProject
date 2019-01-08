package dao;

import group.Group;
import group.GroupDao;
import group.GroupDaoImplement;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DaoMybatisImplement implements Userdao {
	SqlSessionFactory sf = new SqlSessionFactoryBuilder()
			.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("mybatis.xml"));

	@Override
	public int add(User u) {
		int n = 0;
		SqlSession s = sf.openSession();
		try {
			n = s.insert("dao.Userdao.add", u);
			s.commit();
		} catch (Exception e) {
			e.printStackTrace();
			s.rollback();
		} finally {
			s.close();
		}
		return n;
	}

	@Override
	public int update(User u) {
		int n = 0;
		SqlSession s = sf.openSession();
		try {
			n = s.update("dao.Userdao.update", u);
			s.commit();
		} catch (Exception e) {
			e.printStackTrace();
			s.rollback();
		} finally {
			s.close();
		}
		return n;
	}

	@Override
	public int delete(int id) {
		int n = 0;
		SqlSession s = sf.openSession();
		try {
			n = s.delete("dao.Userdao.delete", id);
			s.commit();
		} catch (Exception e) {
			e.printStackTrace();
			s.rollback();
		} finally {
			s.close();
		}
		return n;
	}

	@Override
	public User findById(int id) {
		User u = null;
		SqlSession s = sf.openSession();
		try {
			u = s.selectOne("dao.Userdao.findById", id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		return u;
	}

	@Override
	public List<User> findAll() {
		SqlSession s = sf.openSession();
		List<User> li = null;
		try {
			li = s.selectList("dao.Userdao.findAll");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		return li;
	}

	@Override
	public List<User> findAllAll() {
		SqlSession s = sf.openSession();
		GroupDao groupDao = new GroupDaoImplement();
		List<User> li = s.selectList("dao.Userdao.findAll");
		User u = null;
		Group g = null;
		for (int i = 0; i < li.size(); i++) {
			u = li.get(i);
			g = groupDao.findById(u.getGroupid());
			u.setGroup(g);
		}
		return li;
	}
}
