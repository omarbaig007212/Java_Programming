public class Main{
	public static void main(String[]args){
		// StackUnSynchroinzed stack=new StackUnSynchroinzed(5);
		StackSync stack=new StackSync(5);
		new Thread(()->{
			for(int i=0;i<4;i++)
			{
				stack.push(i);
			}
			stack.staticSyncBlock();
		},"Thread 1").start();
		new Thread(()->{
			for(int i=0;i<4;i++)
			{
				System.out.println(stack.pop());
			}
		},"Thread 2").start();
	}
}