package group;

import java.util.List;

import dao.Mydbutils;

public class GroupDaoImplement implements GroupDao {

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
		String sql = "select * from group1 where id = " + id + ";";
		List<Group> li = Mydbutils.executeR(sql, Group.class);
		if (li.size() > 0) {
			return li.get(0);
		} else
			return null;
	}

	@Override
	public List<Group> findAll() {
		String sql = "select * from group1;";
		List<Group> li = Mydbutils.executeR(sql, Group.class);
		return li;
	}
}
