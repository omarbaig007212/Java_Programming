import java.io.*;
import java.util.*;

public class Main {
    static int arr[][]=new int[21][11];

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<21;i++)
        {
            for(int j=0;j<11;j++)
            {
                arr[i][j]=-1;
            }
        }
        int []w=new int[n];
        int []v=new int[n];
        for(int i=0;i<n;i++){
            v[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            w[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        knap(w,v,k,n);
        System.out.print(arr[n][k]);
    }
    public static int knap(int w[],int v[],int k,int n)
    {
        if(n==0 || k==0)
        {
            return 0;
        }
        if(arr[n][k]!=-1)
        {
            return arr[n][k];
        }
        if(w[n-1]<=k)
        {
            return arr[n][k]=Math.max((v[n-1]+knap(w,v,k-w[n-1],n-1)),knap(w,v,k,n-1));
        }
        else
        {
            return arr[n][k]=knap(w,v,k,n-1);
        }
    }
}