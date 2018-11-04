package zuoye;

//两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。
//已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
public class Pingpang {
	public static void main(String[] args) {
		char i, j, k;
		for (i = 'X'; i <= 'Z'; i++) {
			for (j = 'X'; j <= 'Z'; j++) {
				if (i != j) {
					for (k = 'X'; k <= 'Z'; k++) {
						if (i != k && j != k) {
							if (i != 'X' && k != 'X' && k != 'Z') {
								System.out.println("A--" + i);
								System.out.println("B--" + j);
								System.out.println("C--" + k);
							}
						}
					}
				}
			}
		}
	}

}
