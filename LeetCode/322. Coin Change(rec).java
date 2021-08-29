class Solution {
    public int coinChange(int[] coins, int amount) {
        int m=find(coins,amount,coins.length);
        return (m==Integer.MAX_VALUE-1)?-1:m;
    }
    public static int find(int c[],int k,int n)
    {
        if(k==0||n==0)
        {
            return (k==0)?0:Integer.MAX_VALUE-1;
        }
        if(c[n-1]>k)
        {
            return find(c,k,n-1);
        }
        else
        {
            return Math.min(find(c,k,n-1),1+find(c,k-c[n-1],n));
        }
    }
}
