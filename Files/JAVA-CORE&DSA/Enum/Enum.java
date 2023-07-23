public class Enum {
	enum Status{
		RUNNING,LOADING,WAITING,SUCCESS;
	}
	public static void main(String[] args) {
		Status s=Status.RUNNING;
		System.out.println(Status.RUNNING);	
		System.out.println(Status.LOADING);	
		System.out.println(Status.WAITING);	
		System.out.println(Status.SUCCESS);	
		System.out.println(s.getClass());	
	}
}