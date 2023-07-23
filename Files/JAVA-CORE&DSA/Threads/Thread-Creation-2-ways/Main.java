import java.util.*;

public class Main{
	public static void main(String[]args)
	{
		//Start of main() thread
		System.out.println("Start of main() thread");

		// Thread creation way-1 (Extends Thread which itself implements Runnable)
		ThreadExtends threadExtends = new ThreadExtends("threadExtends");
		// Set setDaemon to true to make it a Daemon
		// threadExtends.setDaemon(true);

		// Main Starting point of Thread
		threadExtends.start();

		// Thread creation way-2 (Runnable Interface)
		Thread threadRunnable = new Thread(new ThreadRunnable(),"ThreadRunnable");
		threadRunnable.start();

		//End of main() thread
		System.out.println("End of main() thread");
	}
}