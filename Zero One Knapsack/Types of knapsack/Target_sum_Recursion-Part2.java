class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        if(nums.length==1)
        {
            if(Math.abs(nums[0])==Math.abs(target))
            {
                return 1;
            }
            return 0;
        }
        if(nums.length==0)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if((sum+target)%2!=0)
        {
            return 0;
        }
        target=((target+sum)/2);
        return solve(nums,target,0);
    }
    public static int solve(int[] nums,int target,int i)
    {
        if(target==0 && i==nums.length)
        {
            return 1;
        }
        if(i==nums.length)
        {
            return 0;
        }
        if(nums[i]<=target)
        {
            return solve(nums,target-nums[i],i+1)+solve(nums,target,i+1);
        }
        return solve(nums,target,i+1);
    }
}
