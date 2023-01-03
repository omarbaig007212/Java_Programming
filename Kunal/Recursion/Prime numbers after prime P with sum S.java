//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static List<String> res;
    public static boolean done[];
    public static int total;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        res=new ArrayList<>();
        int N=sc.nextInt();
        int P=sc.nextInt();
        int S=sc.nextInt();
        done=new boolean[S];
        total=S;
        solve(N,P,S,"");
        System.out.println(res.toString());
    }
    public static void solve(int n,int p,int s,String ss)
    {
        if(s<0)
        {
            return;
        }
        if(s==0 && n==0)
        {
            res.add(ss);
            return;
        }
        for(int i=p+1;i<total;i++)
        {
            if(isPrime(i))
            {
                if(done[i]==false)
                {
                    done[i]=true;
                    solve(n-1, i, s-i, ss+i+" ");
                    done[i]=false;
                }
            }
        }
    }
    public static boolean isPrime(int s)
    {
        for(int i=2;i<s;i++)
        {
            if(s%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
