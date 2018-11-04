package gameRole;

public class Soldier extends Role {
	private int force;

	public Soldier(String name, int force) {
		super(name);
		this.force = force;
	}
//get set
	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int attack() {
		return force;
	}
}
