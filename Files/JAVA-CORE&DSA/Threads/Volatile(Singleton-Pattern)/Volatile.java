public class Volatile{
	public static volatile Volatile volatileObj=null;
	private Volatile()
	{
		System.out.println("Inside constructor."+Thread.currentThread());
	}
	public static void getVolatileInstance()
	{
		if(volatileObj==null)
		{
			synchronized(Volatile.class)
			{
				if(volatileObj==null)
				{
					volatileObj=new Volatile();
				}
			}
		}
	}
}