//https://www.geeksforgeeks.org/problems/partitions-with-given-difference/1

// Here we need subset 1 to be bigger than subset2 hence, modifying the array sorting functionality.
class Solution {
    public static int memo[][];
    public static Integer mod=(int)(1e9+7);
    public static int countPartitions(int n, int d, int[] arr) {
        // code here
        Arrays.sort(arr);
        reverse(arr);
        int total=0;
        for(int x:arr)
        {
            total+=x;
        }
        total=(total+d);
        if(total%2!=0)
        {
            return 0;
        }
        total=total/2;
        memo=new int[arr.length+1][total+1];
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=0;j<=total;j++)
            {
                memo[i][j]=-1;
            }
        }
        return solve(arr,arr.length,total)%mod;
    }
    public static int solve(int[]arr,int n,int total)
    {
        if(n==0)
        {
            memo[n][total]=total==0?1:0;
            return memo[n][total]%mod;
        }
        if(memo[n][total]!=-1)
        {
            return memo[n][total]%mod;
        }
        if(arr[n-1]<=total)
        {
            return memo[n][total]=(solve(arr,n-1,total-arr[n-1])+solve(arr,n-1,total))%(mod);
        }
        else
        {
            return memo[n][total]=solve(arr,n-1,total)%mod;
        }
    }
    public static void reverse(int[]arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
        
