package group;

import java.util.List;

public interface GroupDao {
	int add(Group g);

	int update(Group u);

	int delete(int id);

	Group findById(int id);

	List<Group> findAll();
}
