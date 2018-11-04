package ssm.user;

public class User {
	private Integer operator_id;
	private String name;
	private String password;
	private Integer status;

	@Override
	public String toString() {
		return "User [operator_id=" + operator_id + ", name=" + name + ", password=" + password + ", status=" + status
				+ "]";
	}

	public Integer getOperator_id() {
		return operator_id;
	}

	public void setOperator_id(Integer operator_id) {
		this.operator_id = operator_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public User() {

	}

	public User(Integer operator_id, String name, String password, Integer status) {
		super();
		this.operator_id = operator_id;
		this.name = name;
		this.password = password;
		this.status = status;
	}

	public User(String name, String password, Integer status) {
		super();
		this.name = name;
		this.password = password;
		this.status = status;
	}

}
