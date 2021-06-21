import java.io.*;
import java.util.*;
public class Scrambled_String_Recursive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String sr=sc.next();
		if(s.length()!=sr.length())
			System.out.println("False");
		else
			System.out.println(solve(s,sr));
	}
	public static boolean solve(String s,String sr)
	{
		if(s.equals(sr))
			return true;
		if(s.length()<=1 || sr.length()<=1||s.length!=sr.length())
			return false;
		int n=s.length();
		boolean flag=false;
		for(int i=1;i<n;i++)
		{
			if((solve(s.substring(0,i), sr.substring(0,i))&&(solve(s.substring(i), sr.substring(i))))||
			((solve(s.substring(0,i), sr.substring(i))&&(solve(s.substring(i),sr.substring(0,i)))))==true)
			{
				flag= true;
				break;
			}
		}
		return flag;
	}
}
