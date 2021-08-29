class Solution {
    static int arr[][];
    public int coinChange(int[] coins, int amount) {
        arr=new int[amount+1][coins.length+1];
        for(int i=0;i<=amount;i++)
        {
            for(int j=0;j<=coins.length;j++)
            {
                arr[i][j]=-1;
            }
        }
        int m=find(coins,amount,coins.length);
        return (m==Integer.MAX_VALUE-1)?-1:m;
    }
    public static int find(int c[],int k,int n)
    {
        if(k==0||n==0)
        {
            return (k==0)?0:Integer.MAX_VALUE-1;
        }
        if(arr[k][n]!=-1)
        {
            return arr[k][n];
        }
        if(c[n-1]>k)
        {
            return arr[k][n]=find(c,k,n-1);
        }
        else
        {
            return arr[k][n]=Math.min(find(c,k,n-1),1+find(c,k-c[n-1],n));
        }
    }
}
