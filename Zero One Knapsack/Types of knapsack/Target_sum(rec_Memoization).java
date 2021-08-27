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
        // for (int[] row: ar)
        //     Arrays.fill(row, -1);
        find(nums.length,nums,target);
        return ans;
    }
    public static void find(int idx,int arr[],int target)
    {
        if(target==0 && idx==0)
        {
            ar[idx][target]=1;
            ans++;
            return;
        }
        if(idx>0 && target>0 && ar[idx][target]!=0)
        {
            ans++;
            return;
        }
            if(idx>0)
            {
                 find(idx-1,arr,target-arr[idx-1]);
                 find(idx-1,arr,target);
            }
    }
}
