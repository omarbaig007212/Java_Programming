class Solution {
    public int search(int[] nums, int target) {
        int pivotIDX=indexPost(nums);
        if(pivotIDX!=-1)
        {
            if(nums[pivotIDX]==target)
            {
                return pivotIDX;
            }
            if(nums[0]>target)
            {
                return find(nums,pivotIDX+1,nums.length-1,target);
            }
            return find(nums,0,pivotIDX-1,target);
        }
        return find(nums,0,nums.length-1,target);
    }
    public static int find(int nums[],int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static int indexPost(int[]nums)
    {
        int start=0,end=nums.length-1,mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(mid<nums.length-1 && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            if(mid>0 && nums[mid-1]>nums[mid])
            {
                return mid-1;
            }
            if(nums[start]<=nums[mid])
            {
                start=mid+1;
            }
            else if(nums[start]>=nums[mid])
            {
                end=mid-1;
            }
        }
        return -1;
    }
}
