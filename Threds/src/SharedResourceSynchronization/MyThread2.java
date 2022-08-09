package SharedResourceSynchronization;

public class MyThread2 extends Thread {

	private SharedData data;

	public MyThread2(SharedData data) {
		this.data = data;
	}

	@Override
	public void run() {
		try {
			System.out.print(" ");
			data.display("Welcome");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
