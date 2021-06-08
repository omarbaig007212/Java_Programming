import java.util.*;
public class LCS_MEMOIZE {
    public static int[][]t=new int[1001][1001];
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);  
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=s1.length();
        int m=s2.length();
        for(int i=0;i<1001;i++)
            for(int j=0;j<1001;j++)
                t[i][j]=-1;
        System.out.println(func(s1,s2,n,m));
    }
    public static int func(String text1,String text2,int n,int m){
        if(n==0||m==0)
            return 0;
        if(t[n][m]!=-1)
            return t[n][m];
        else
            if(text1.charAt(n-1)==text2.charAt(m-1))
                return t[n][m]=1+func(text1,text2,n-1,m-1);
            else
                return t[n][m]=Math.max((func(text1, text2, n-1, m)),(func(text1, text2, n, m-1)));
    }
}
