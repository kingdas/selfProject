package zuoye;

import java.util.Scanner;

//企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
//利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
//高于10万元的部分，可可提成7.5%；
//20万到40万之间时，高于20万元的部分，可提成5%；
//40万到60万之间时高于40万元的部分，可提成3%；
//60万到100万之间时，高于60万元的部分，可提成1.5%，
//高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润，求应发放奖金总数？  
public class Profit {
	public static void main(String[] args) {
		System.out.println("利润为：");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int s = p/10;
		double t = 0;
		switch (s) {
		case 0:
			t = p*0.1;
			break;
		case 1:
			t = 1 + (p-10)*0.075;
			break;
		case 2:
		case 3:
			t= 1.75 + (p-20)*0.05;
			break;
		case 4:
		case 5:
			t = 2.75 + (p-40)*0.03;
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			t=3.35 +(p-60)*0.015;
			break;
		case 10:
			t= 3.95+(p-100)*0.01;
			break;		
		}
		System.out.println("奖金为"+t+"万元");
	}

}
