import java.io.*;
import java.util.*;
public class Evaluate_Exp_True {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] ch = s.toCharArray();
		System.out.println(solve(ch,0,s.length()-1,true));
	}
	public static int solve(char[]s,int i,int j,boolean isTrue)
	{
		
		if(i>=j)
		{
			if(isTrue==true)
			{
				if(s[i]=='T')
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
			else
			{
				if(isTrue==false)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
		}
		int ans=0;
		for(int k=i+1;k<j;k+=2)
		{
			int lt=solve(s, i, k-1, true);
			int lf=solve(s, i, k-1, false);
			int rt=solve(s, k+1, j, true);
			int rf=solve(s, k+1, j, false);
			if(s[k]=='&')
			{
				if(isTrue==true)
					ans=ans+lt*rt;
				else
					ans=ans+lt*rf+rt*lf+lf*rf;
			}	
			if(s[k]=='|')
			{
				if(isTrue==true)
					ans=ans+lt*rt+lt*rf+rt*lf;
				else
					ans=ans+lf*rf;
			}
			if(s[k]=='^')
			{
				if(isTrue==true)
					ans=ans+lt*rf+rt*lf;
				else
					ans=ans+lf*rf+lt*rt;
			}			
		}
		return ans;
	}
}


                        
