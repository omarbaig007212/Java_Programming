import java.util.*;
public class Main {
	public static void main(String[]args){
		new Thread(()->{
			Volatile.getVolatileInstance();
		},"Thread 1").start();
		new Thread(()->{
			Volatile.getVolatileInstance();
		},"Thread 2").start();
	}
}