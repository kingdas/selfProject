package zuoye;
//一球从100米高度自由落下，每次落地后反跳回原高度的一半；
//再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
public class BallRebound {
	public static void main(String[] args) {
		double path = 200 ;
		double height = 100;
		for(int i =0; i<8; i++){
			double inipath = 100;
			inipath/=2;
			path+=inipath;
		}
		System.out.println("the path of ten is "+path+" meters");
		for(int j = 0; j<10; j++){
			height/=2;
		}
		System.out.println("the rebound height of ten is "+height+" meters");
	}

}
