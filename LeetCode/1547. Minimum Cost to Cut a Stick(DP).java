class Solution {
    public int minCost(int n, int[] cuts) {
        int c[]=new int[cuts.length+2];
        for(int i=0;i<cuts.length;i++)
        {
            c[i+1]=cuts[i];
        }
        c[c.length-1]=n;
        Arrays.sort(c);
        int dp[][]=new int[c.length][c.length];
        for(int i=0;i<c.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                for(int k=i-1;k>j;k--)
                {
                    int ans=Math.min(dp[j][i]==0?Integer.MAX_VALUE:dp[j][i],dp[j][k]+dp[k][i]+c[i]-c[j]);
                    dp[j][i]=ans;
                }
            }
        }
        return dp[0][c.length-1];
    }
}
