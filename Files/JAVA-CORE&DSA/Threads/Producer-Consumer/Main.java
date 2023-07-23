public class Main{
	public static void main(String[]args){
		ProducerandConsumer pac = new ProducerandConsumer(5);
		new Thread(()->{
			for(int i=0;i<10;i++)
			{
				pac.producer(i);
			}
		},"Thread 1").start();
		new Thread(()->{
			for(int i=0;i<10;i++)
			{
				pac.consumer();
			}
		},"Thread 2").start();
	}
}