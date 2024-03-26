class Solution{
    // public static int memo[][][];
    int longestCommonSubstr(String s1, String s2, int n, int m){
        // memo=new int[n+1][m+1][Math.min(n,m)+1];
        // for(int i=0;i<=n;i++)
        // {
        //     for(int j=0;j<=m;j++)
        //     {
        //         for(int k=0;k<=(Math.min(n,m));k++)
        //         {
        //             memo[i][j][k]=-1;
        //         }
        //     }
        // }
        // for(int i=0;i<=n;i++)
        // {
        //     memo[i][0][0]=0;
        // }
        // for(int i=0;i<=m;i++)
        // {
        //     memo[0][i][0]=0;
        // }
        // return solve(s1,s2,n,m,0);


      //DP Cause it's the only option
        int dp[][]=new int[n+1][m+1];
        int res=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                    res=Math.max(dp[i][j],res);
                }
                else
                {
                    dp[i][j]=0;
                }
            }
        }
        return res;
    }
    public static int solve(String s1,String s2,int n,int m,int count)
    {
        if(n==0 || m==0)
        {
            return count;
        }
        int temp1=count;
        if(memo[n][m][count]!=-1)
        {
            return memo[n][m][count];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1))
        {
            temp1=solve(s1,s2,n-1,m-1,count+1);
        }
        int diff1=solve(s1,s2,n-1,m,0);
        int diff2=solve(s1,s2,n,m-1,0);
        int res=Math.max(temp1,Math.max(diff1,diff2));
        memo[n][m][count]=res;
        return res;
    }
}
