public class StackSync {
	private int stackTop;
	private int stack[];
	private int stackSize;
	StackSync(int size)
	{
		this.stackSize=size;
		stack=new int[stackSize];
		stackTop=-1;
	}
	//Static Synchronized
	public static void staticSyncBlock()
	{
		synchronized(StackSync.class)
		{
			System.out.println("Hello "+Thread.currentThread());
		}
	}

	public synchronized void push(int element)
	{
		// synchronized(this)
		// {
			if(stackTop==stackSize)
			{
				return;
			}
			stackTop++;
			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				new Exception(e);
			}
			stack[stackTop]=element;
		// }
	}
	public synchronized int pop()
	{
		// synchronized(this)
		// {
			if(stackTop==-1)
			{
				return -1;
			}
			int element = stack[stackTop];
			try{
				Thread.sleep(1000);
			}
			catch (Exception e) {
				new Exception(e);
			}
			stackTop--;
			return element;
		// }
	}
}