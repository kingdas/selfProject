package gameRole;

public class Magicer extends Role {
	private int magicgrade;

	public Magicer(String name,int magicgrade) {
		super(name);
		this.magicgrade = magicgrade;

	}
//get set
	public int getMagicgrade() {
		return magicgrade;
	}

	public void setMagicgrade(int magicgrade) {
		this.magicgrade = magicgrade;
	}

	public int attack() {
		return magicgrade * 5;
	}
}
