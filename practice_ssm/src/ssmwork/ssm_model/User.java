package ssmwork.ssm_model;

public class User {
	private Integer id;
	private String name;
	private int groupid;
	private String groupname;
	private Group group;

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public User(Integer id, String name, int groupid, String groupname) {
		this.id = id;
		this.name = name;
		this.groupid = groupid;
		this.groupname = groupname;
	}

	public User(Integer id, String name, int groupid) {
		this.id = id;
		this.name = name;
		this.groupid = groupid;
	}

	public User(String name, int groupid) {
		this.name = name;
		this.groupid = groupid;
	}

	public User() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroupid() {
		return groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", groupid=" + groupid
				+ ", groupname=" + groupname + "]";
	}

}
