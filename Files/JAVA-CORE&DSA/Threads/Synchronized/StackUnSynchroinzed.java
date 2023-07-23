public class StackUnSynchroinzed {
	private int stackTop;
	private int stack[];
	private int stackSize;
	StackUnSynchroinzed(int size)
	{
		this.stackSize=size;
		stack=new int[stackSize];
		stackTop=-1;
	}
	public void push(int element)
	{
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
	}
	public int pop()
	{
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
	}
}