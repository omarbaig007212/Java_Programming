class Solution {
    public int[] sortArray(int[] nums) {
        solve(nums,0,nums.length);
        return nums;
    }
    public static void solve(int []nums,int l,int r)
    {
        if(l-r==0)
        {
            return;
        }
        int pivot=(l+r)/2;
        swap(nums,l,pivot);
        int i=l;
        for(int j=i+1;j<r;j++)
        {
            if(nums[j]<nums[i])
            {
                swap(nums,i++,j);
                swap(nums,i,j);
            }
        }
        solve(nums,l,i);
        solve(nums,i+1,r);
    }
    public static void swap(int []nums,int l,int r)
    {
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}
