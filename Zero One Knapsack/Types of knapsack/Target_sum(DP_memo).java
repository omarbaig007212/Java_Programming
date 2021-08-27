class Solution {
    public static int ans;
    public static int ar[][];
    public int findTargetSumWays(int[] nums, int target) {
        if(nums.length==1)
        {
            if(Math.abs(nums[0])==Math.abs(target))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else if(nums.length==0)
        {
            return 0;
        }
        ans=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if((sum+target)%2!=0)
        {
            return 0;
        }
        target=(sum+target)/2;
        ar=new int[nums.length+1][target+1];
        for(int i=0;i<=target;i++)
        {
            ar[0][i]=0;
        }
        int k=1;
        ar[0][0]=1;
        for(int i=1;i<=nums.length;i++)
        {
            if(nums[i-1]==0)
            {
                ar[i][0]=(int)Math.pow(2,k);
                k++;
            }
            else
            {
                ar[i][0]=ar[i-1][0];
            }
        }
        for(int i=1;i<=nums.length;i++)
        {
            for(int j=1;j<=target;j++)
            {
                if(nums[i-1]<=j)
                {
                    ar[i][j]=ar[i-1][j]+ar[i-1][j-nums[i-1]];
                }
                else
                {
                    ar[i][j]=ar[i-1][j];
                }
            }
        }
        return ar[nums.length][target];
    }
}
