//This question Had No repeating element thus what i did is i neglected the fact of arr[val]!=arr[i]; but keeping that also dosn't affect the answer.
//If the value of Array Element is larger or equal to N which is not the index present in arr, we just skip that index with i++;


class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int N=nums.length;
        while(i<N)
        {
            if(nums[i]<N && nums[i]!=i)
            {
                swap(nums,nums[i],i);
            }
            else
            {
                i++;
            }
        }
        i=0;
        int M=N+1;
        while(i<N)
        {
            if(i==nums[i])
            {
                i++;
            }
            else
            {
                break;
            }
        }
        return i;
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
