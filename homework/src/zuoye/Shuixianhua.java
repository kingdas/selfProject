package zuoye;
//打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
//例如：153是一个 "水仙花数 "
//，因为153=1的三次方＋5的三次方＋3的三次方。
public class Shuixianhua {
	public static void main(String[] args) {
		int i;
		int a,b,c;
		for (i = 100; i <= 999; i++) {
			a = i / 100;
			b = (i - a * 100) / 10;
			c = i - a * 100 - b * 10;
			if (i == a * a * a + b * b * b + c * c * c) {
				System.out.println(i);
			}
			else
			continue;
		}
	}

}
