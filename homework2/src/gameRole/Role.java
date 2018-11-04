package gameRole;

public class Role {
	private String name;

	public Role() {

	}

	public Role(String name) {
		this.name = name;
	}

	// get and set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int attack() {
		return 0;
	}
}
