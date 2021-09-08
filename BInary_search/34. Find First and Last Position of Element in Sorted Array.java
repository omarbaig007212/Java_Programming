class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=find(nums,target,true);
        arr[1]=find(nums,target,false);
        return arr;
    }
    public static int find(int[] nums,int target,boolean isValid)
    {
        int start=0,end=nums.length-1,ans=-1,mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                ans=mid;
                if(isValid)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
