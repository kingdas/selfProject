package zuoye;

//有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。
//问第4个人岁数，他说比第3个人大2岁。
//问第三个人，又说比第2人大两岁。
//问第2个人，说比第一个人大两岁。
//最后问第一个人，他说是10岁。请问第五个人多大？
public class Age_fifthperson {
	public static void main(String[] args) {
		int firstperson = 10, fifthperson = 0;
		for (int i = 1; i < 5; i++) {
			firstperson += 2;
		}
		fifthperson = firstperson;
		System.out.println("the age of fifth person is "+fifthperson);
	}

}
