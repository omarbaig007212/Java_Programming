class Solution {
    public int superEggDrop(int e, int f) {
        int dp[][]=new int[f+1][e+1];  
        for(int i=0;i<=f;i++)
        {
            for(int j=0;j<=e;j++)
            {
                dp[i][j]=0;
            }
        }
        for(int i=1;i<=f;i++)
        {
            for(int j=1;j<=e;j++)
            {
                dp[i][j]=1+dp[i-1][j-1]+dp[i-1][j];
            }
            if(dp[i][e]>=f)
            {
                return i;
            }
        }
        return 0;
    }
}
