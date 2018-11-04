package thread;

//public class MyThread extends Thread {
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getName());
//	}
//}

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
