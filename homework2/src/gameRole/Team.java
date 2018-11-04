package gameRole;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {
	ArrayList<Role> t = new ArrayList<Role>();
	Scanner s = new Scanner(System.in);

	// addmember method
	public void addMember() { 
		if (t.size() < 6) {
			System.out.println("select member kind 1（法师） or 2（战士） ");
			int select = s.nextInt(3);
			if (select == 1) {
				System.out.println("input the magicer's name and grade :");
				String magicername = s.next();
				int magicergrade = s.nextInt();
				t.add(new Magicer(magicername, magicergrade));
			} else {
				System.out.println("input the soldier's name and force :");
				String soldiername = s.next();
				int soldierforce = s.nextInt();
				t.add(new Soldier(soldiername, soldierforce));
			}
		} else
			System.out.println("the number of teammates is full !");
	}

	// attack method
	public int attackSum() {
		int sum = 0;
		for (int i = 0; i < t.size(); i++) {
			sum += t.get(i).attack();
		}
		return sum;
	}
}
