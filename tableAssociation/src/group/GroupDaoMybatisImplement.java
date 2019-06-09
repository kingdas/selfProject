package group;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GroupDaoMybatisImplement implements GroupDao {

	SqlSessionFactory sf = new SqlSessionFactoryBuilder()
			.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("mybatis.xml"));

	@Override
	public int add(Group g) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Group u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Group findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> findAll() {
		SqlSession s = sf.openSession();
		List<Group> li = s.selectList("group.GroupDao.findAll");
		s.close();
		return li;
	}

}
