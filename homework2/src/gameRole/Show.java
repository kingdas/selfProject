package gameRole;

public class Show {
	public static void main(String[] args) {
		Team t = new Team();
		t.addMember();
		t.addMember();
		t.addMember();
		t.addMember();
		t.addMember();
		System.out.println("组队成员为 ：");
		for (int i = 0; i < t.t.size(); i++) {
			System.out.println(t.t.get(i).getName());
		}
		System.out.println("小队的总攻击力为 ：" + t.attackSum());
	}
}
