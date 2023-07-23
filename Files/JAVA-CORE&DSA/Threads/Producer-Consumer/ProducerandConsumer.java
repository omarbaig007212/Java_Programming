import java.util.*;
public class ProducerandConsumer{
	private Queue<Integer> q;
	private int size;
	ProducerandConsumer(int size)
	{
		q=new LinkedList<>();
		this.size=size;
	}
	public void producer(int element)
	{
		synchronized(q){
			while(q.size()==size)
			{
				try{
					q.wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			q.add(element);
			System.out.println(" Added : "+element+" Size: "+q.size());
			q.notifyAll();
		}
	}
	public void consumer()
	{
		synchronized(q){
			while(q.size() == 0)
			{
				try{
					q.wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			int element = q.remove();
			System.out.println(" Removed :"+ element + " Size: "+q.size());
			q.notifyAll();
		}
	}
}