import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []w=new int[n];
        int []v=new int[n];
        for(int i=0;i<n;i++){
            v[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            w[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(knap(w,v,k,n));
    }
    public static int knap(int w[],int v[],int k,int n)
    {
        if(n==0 || k==0)
        {
            return 0;
        }
        if(w[n-1]<=k)
        {
            return Math.max((v[n-1]+knap(w,v,k-w[n-1],n-1)),knap(w,v,k,n-1));
        }
        else
        {
            return knap(w,v,k,n-1);
        }
    }
}