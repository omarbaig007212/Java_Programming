import java.util.*;
public class LCS_Recursive{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=s1.length();
        int m=s2.length();
        System.out.println(func(s1,s2,n,m));
    }
    public static int func(String s1,String s2,int n,int m)
    {
        if(n==0||m==0)
            return 0;
        if(s1.charAt(n-1)==s2.charAt(m-1))
            return 1+func(s1,s2,n-1,m-1);
        else
            return Math.max(func(s1,s2,n-1,m),func(s1, s2, n, m-1));
    }
}
