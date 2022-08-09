package SharedResourceSynchronization;

public class DriverClass {

	public static void main(String[] args) {

		SharedData sharedData=new SharedData();
		MyThread1 myThread1=new MyThread1(sharedData);
		myThread1.start();
		
		

		MyThread2 myThread2=new MyThread2(sharedData);
		myThread2.start();
		
	}

}
