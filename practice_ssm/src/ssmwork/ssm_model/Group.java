package ssmwork.ssm_model;

public class Group {
	private int id;
	private String groupname;

	public Group(int id, String groupname) {
		this.id = id;
		this.groupname = groupname;
	}

	public Group() {

	}
//////////////
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

}
