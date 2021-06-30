import java.util.*;
public class String_Sort {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        int i1=0;
        while(i1<n)
        {
            s[i1]=sc.next();
            i1++;
        }
        String s1="";
        String s2="";
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                s1=s[j-1];
                s2=s[j];
                if(complen(s1,s2)>0)
                {
                    String temp=s[j-1];
                    s[j-1]=s[j];
                    s[j]=temp;
                }
            }
        }
        for(int j=0;j<n;j++)
            System.out.println((s[j]));  
    }
    
	public static int complen(String s1,String s2)
	{
        int n=s1.length();
        int m=s2.length();
        int n1=n<=m?n:m;
                int i=0;
                while(i<n1)
                {
					int c1=(int)s1.charAt(i);
					int c2=(int)s2.charAt(i);
					int c=c1-c2;
					if(c>0)
                    {
                        return 1;
                    }
                    else if(c<0)
                    {
                        return -1;
                    }
					i++;
				}
			if(i<n)
				return -1;
			if(i<m)
				return 1;
			return 0;
	}
}
