import java.util.*;

import jdk.internal.loader.AbstractClassLoaderValue.Sub;
public class EqualSumPartition {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int wt[]=new int[n];
        for(int i=0;i<n;i++)
        {
            wt[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=wt[i];
        }
        if(sum%2!=0)
        {
            System.out.println("false");
        }
        System.out.println(SubsetSum(wt, sum/2, n));
    }
    public static boolean SubsetSum(int wt[],int k,int n)
    {
        boolean t[][]=new boolean[n+1][k+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<k+1;j++)
            {
                if(i==0)
                {
                    t[i][j]=false;
                }
                if(j==0)
                {
                    t[i][j]=true;
                }
            }
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<k+1;j++)
            {
                if(wt[i-1]<=j)
                {
                    t[i][j]=t[i-1][j-wt[i-1]]||t[i-1][j];
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
            }
        }
        System.out.println(t[n][k]);
    }
}
