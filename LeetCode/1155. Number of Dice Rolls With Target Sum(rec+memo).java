class Solution {
    public static int dp[][];
    public static int mod=(int)Math.pow(10,9)+7;
    public int numRollsToTarget(int d, int f, int target) {
        dp=new int[d+1][target+1];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }
        return find(d,f,target);
    }
    public static int find(int d,int f,int target)
    {
        if(d==0 && target==0)
        {
            return 1;
        }
        if(d==0 || target<0)
        {
            return 0;
        }
        if(dp[d][target]!=-1)
        {
            return dp[d][target];
        }
        int ans=0;
        for(int i=1;i<=f;i++)
        {
            ans=(ans+find(d-1,f,target-i))%mod;
        }
        return dp[d][target]=ans;
    }
}
