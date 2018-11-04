package zuoye;
//古典问题：有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一对兔子，
//假如兔子都不死，问每个月的兔子总数为多少？ 
//这是一个菲波拉契数列问题
public class Rabbit {
	public static void main(String[] args) {
		int sum_rabbit;
		int new_rabbit = 1;
		int old_rabbit = 1;
		for (int i = 3; i <= 12; i++) {
			sum_rabbit = new_rabbit + old_rabbit;
			old_rabbit = new_rabbit;
			new_rabbit = sum_rabbit;
			System.out.println("第" + i + "个月兔子总数" + sum_rabbit);
		}
	}

}
