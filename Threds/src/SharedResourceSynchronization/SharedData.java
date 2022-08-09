package SharedResourceSynchronization;

public class SharedData {

	public synchronized void display(String string) throws InterruptedException {
		for (int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i));
Thread.sleep(100)
;		}
	}
}
