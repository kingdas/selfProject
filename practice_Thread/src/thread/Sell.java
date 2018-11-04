package thread;

public class Sell implements Runnable {
	private int ticket = 10;
	private Object o = new Object();

	@Override
	public void run() {
		while (ticket > 0) {
			sell();
		}
	}

	private void sell() {
		synchronized (o) {
			if (ticket > 0) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "Âô³ö" + ticket--);
			}
		}

	}

}
