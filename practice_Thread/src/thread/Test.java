package thread;

public class Test {
	public static void main(String[] args) {
		// MyThread �̳� Thread��
//		MyThread my = new MyThread();
//		my.start();
//		System.out.println(Thread.currentThread().getName());
/////////////////////////////////////
		// MyThread ʵ��runnable �ӿ� ����MyThread������ֱ��ʹ��start() ����

//		MyThread mt = new MyThread();
//		Thread t = new Thread(mt, "my");
//		t.start();

		////////////////////////////////////
		// ��Ʊ����

		Sell s = new Sell();
		Thread t1 = new Thread(s, "����һ");
		t1.start();
		Thread t2 = new Thread(s, "���ڶ�");
		t2.start();
		Thread t3 = new Thread(s, "������");
		t3.start();
	}
}
