// The minimun no of splits can be (1) so that means the min=minimum_no_of_splits;
// The maximum no of splits can be (array.length) which means that max=(max value of elements in array);
// The start will be the max and end will be the min value;
// If the sum of values are <= mid then include if not start again and increment the value. 
// The main goal is to minimize the mid value , thus end=mid; if the split<=m; else start=mid+1;

class Solution {
    public int splitArray(int[] nums, int m) {
        int min=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            min+=nums[i];
            max=Math.max(max,nums[i]);
        }
        if(m==1)
        {
            return min;
        }
        if(m==nums.length)
        {
            return max;
        }
        int start=max;
        int end=min;
        int mid=0;
        while(start<end)
        {
            int splits=1;
            int sum=0;
            mid=start+(end-start)/2;
            for(int i=0;i<nums.length;i++)
            {
                if(sum+nums[i]<=mid)
                {
                    sum+=nums[i];
                }
                else
                {
                    splits++;
                    sum=nums[i];
                }
            }
            if(splits<=m)
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return end;
    }
}
