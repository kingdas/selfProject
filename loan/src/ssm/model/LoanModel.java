package ssm.model;

public class LoanModel {
	private Integer id;
	private String name;
	private String loginName;
	private String password;
	private Integer groupId;

	public LoanModel() {
		super();

	}

	public LoanModel(Integer id, String name, String loginName, String password, Integer groupId) {
		super();
		this.id = id;
		this.name = name;
		this.loginName = loginName;
		this.password = password;
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return "LoanModel [id=" + id + ", name=" + name + ", loginName=" + loginName + ", password=" + password
				+ ", groupId=" + groupId + "]";
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

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

}
