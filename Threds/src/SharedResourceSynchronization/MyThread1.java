package SharedResourceSynchronization;

public class MyThread1 extends Thread {
	private SharedData data;

	public MyThread1(SharedData data) {
		this.data = data;
	}

	@Override
	public void run() {
		try {
			data.display("Hello World");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
