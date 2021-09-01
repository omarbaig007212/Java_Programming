class Solution {
    public static int dp[][];
    public static int mod=(int)Math.pow(10,9)+7;
    public int numRollsToTarget(int d, int f, int target) {
        dp=new int[d+1][target+1];
        for(int i=0;i<=d;i++)
        {
            dp[i][0]=0;
        }
        for(int i=0;i<=target;i++)
        {
            dp[0][i]=0;
        }
        dp[0][0]=1;
        for(int i=1;i<=d;i++)
        {
            for(int j=1;j<=target;j++)
            {
                int ans=0;
                for(int k=1;k<=f;k++)
                {
                    if(j-k<0)
                    {
                        break;
                    }
                    ans=(ans+dp[i-1][j-k])%mod;
                }
                dp[i][j]=ans;
            }
        }
        // for(int i=0;i<=d;i++)
        // {
        //     for(int j=0;j<=target;j++)
        //     {
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        return dp[d][target];
    }
}
