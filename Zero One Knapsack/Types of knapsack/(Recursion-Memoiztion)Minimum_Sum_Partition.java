//User function Template for Java

class Solution
{
    public static int res;
    public static int memo[][];
	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int total=0;
	    for(int x:arr)
	    {
	        total+=x;
	    }
	    memo=new int[n+1][total+1];
	    for(int i=0;i<=n;i++)
	    {
	        for(int j=0;j<=total;j++)
	        {
	            memo[i][j]=-1;
	        }
	    }
	    res=Integer.MAX_VALUE;
	    solve(arr,n,new ArrayList<>(),new ArrayList<>(),0,0);
	    return res;
	} 
	public static void solve(int[]arr,int n,ArrayList<Integer> set1,ArrayList<Integer> set2,int count1,int count2)
	{
	    if(n==0)
	    {
	        res=Math.min(res,Math.abs(count1-count2));
	        return;
	    }
	    if(memo[n][count1]!=-1)
	    {
	        res=Math.min(res,memo[n][count1]);
	        return;
	    }
	    set1.add(arr[n-1]);
	    solve(arr,n-1,set1,set2,count1+arr[n-1],count2);
	    set1.remove(set1.size()-1);
	    set2.add(arr[n-1]);
	    solve(arr,n-1,set1,set2,count1,count2+arr[n-1]);
	    set2.remove(set2.size()-1);
	    memo[n][count1]=res;
	}
}
