public class Main{
	public static void main(String[] args) {
		System.out.println("Main thread started...........");
		Thread thread1 = new Thread(()->{
			System.out.println("Thread "+Thread.currentThread());
		},"Thread1");
		thread1.start();
		try{
			thread1.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main thread exiting...........");
	}
}