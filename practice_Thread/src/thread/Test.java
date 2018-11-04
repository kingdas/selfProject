package thread;

public class Test {
	public static void main(String[] args) {
		// MyThread 继承 Thread类
//		MyThread my = new MyThread();
//		my.start();
//		System.out.println(Thread.currentThread().getName());
/////////////////////////////////////
		// MyThread 实现runnable 接口 这种MyThread对象不能直接使用start() 方法

//		MyThread mt = new MyThread();
//		Thread t = new Thread(mt, "my");
//		t.start();

		////////////////////////////////////
		// 售票例子

		Sell s = new Sell();
		Thread t1 = new Thread(s, "窗口一");
		t1.start();
		Thread t2 = new Thread(s, "窗口二");
		t2.start();
		Thread t3 = new Thread(s, "窗口三");
		t3.start();
	}
}
