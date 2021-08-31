class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int[nums.length+1][nums.length+1];
        for(int i=nums.length-1;i>=0;i--)
        {
            for(int j=nums.length-1;j>=-1;j--)
            {
                int c1=0;
                if(j==-1||nums[j]<nums[i])
                {
                    c1=1+dp[i+1][i+1];
                }
                int c2=dp[i+1][j+1];
                dp[i][j+1]=Math.max(c1,c2);
            }
        }
        return dp[0][0];
    }
}
