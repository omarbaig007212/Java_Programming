// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{

    static int a[][];
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        a=new int[N+1][sum+1];
        for(int i=0;i<=N;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                a[i][j]=-1;
            }
        }
        return find(N,sum,arr);
    }
    public static boolean find(int n,int sum,int arr[])
    {
        if(sum==0)
        {
            return true;
        }
        if(n==0)
        {
            return false;
        }
        if(a[n][sum]!=-1)
        {
            if(a[n][sum]==1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        if(arr[n-1]<=sum)
        {
            boolean f=find(n-1,sum-arr[n-1],arr)||find(n-1,sum,arr);
            if(f)
            {
                a[n][sum]=1;
            }
            else
            {
                a[n][sum]=0;
            }
            return f;
        }
        boolean f=find(n-1,sum,arr);
         if(f)
            {
                a[n][sum]=1;
            }
            else
            {
                a[n][sum]=0;
            }
            return f;
    }
}
