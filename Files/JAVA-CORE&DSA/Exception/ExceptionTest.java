import java.util.*;

class CustomException extends Exception{
	CustomException(){
		super("Custom error... ");
	}
	CustomException(String msg){
		super(msg);
	}
}
class ExceptionTest{
	public static void main(String[]args){
		System.out.println("Started.....");
		try{
			int arg1 = Integer.parseInt(args[0]);
			int arg2 = Integer.parseInt(args[1]);
			System.out.println("Dividng.......");
			int res = arg1/arg2;
			System.out.println("Result of dividing : "+res);
			if(arg2<10)
			{
				CustomException r=new CustomException();
				throw r;
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception of /0 .......");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception of wrong input .......");
			System.out.println(e.getMessage());
		}
		catch(CustomException e)
		{
			System.out.println("Custom Exception .......");
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("General Exception.......");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Closing All Connections ---- ");
		}
		System.out.println("Exit...........");
	}
}