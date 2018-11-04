package zuoye;
/*
 * 利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，
 * 60-89分之间的用B表示，60分以下的用C表示。
 */
public class Chengji {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 79;
		if(c >= 90){
			System.out.println("A");
		}
		else if(90>c&&c>=60){
			System.out.println("B");
		}
		else
		System.out.println("C");
		
	}

}
