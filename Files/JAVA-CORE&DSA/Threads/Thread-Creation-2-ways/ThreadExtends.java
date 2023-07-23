public class ThreadExtends extends Thread {
	ThreadExtends(String name)
	{
		super(name);
	}
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread "+i+" -- "+this.currentThread()+" -- Name --> "+this.currentThread().getName());
		}
	}
}
