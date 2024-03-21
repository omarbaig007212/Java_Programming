//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends




class Solution{
    public static int memo[][];
    public static Integer mod = (int)(1e9+7);
	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    memo=new int[n+1][sum+1];
	    for(int i=0;i<=n;i++)
	    {
	        for(int j=0;j<=sum;j++)
	        {
	            memo[i][j]=-1;
	        }
	    }
	    solve(arr,n,sum);
	    return memo[n][sum]%mod;
	} 
	public static int solve(int[]arr,int n,int sum)
	{
	    if(sum==0 && n==0)
	    {
	        memo[n][sum]=1;
	        return memo[n][sum];
	    }
	    if(n==0)
	    {
	        memo[n][sum]=0;
	        return memo[n][sum];
	    }
	    if(memo[n][sum]!=-1)
	    {
	        return memo[n][sum];
	    }
	    if(arr[n-1]<=sum)
	    {
	        return  memo[n][sum]=(solve(arr,n-1,sum-arr[n-1])+solve(arr,n-1,sum))%mod;
	    }
	    return  memo[n][sum]=solve(arr,n-1,sum)%mod;
	}
}
