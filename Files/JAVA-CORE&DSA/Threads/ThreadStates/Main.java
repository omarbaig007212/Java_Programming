//Printing Different States of thread
public class Main{
	public static void main(String[]args){
		System.out.println("Main Starting.");
		Thread thread1=new Thread(()->{
			try{Thread.sleep(1);}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int i=0;i<1000;i++){}
			
		},"Thread 1");
		
		synchronized(thread1)
		{
			try{
				System.out.println(" WWW");
				thread1.wait(1);
				Thread.State threadState = thread1.getState();
				System.out.println("Here www : "+threadState);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		thread1.start();

		while(true)
		{
			Thread.State threadState = thread1.getState();
			System.out.println(threadState);
			if(threadState == Thread.State.TERMINATED)
			{
				break;
			}
		}

		System.out.println("Main Exitiing. ");
	}
}