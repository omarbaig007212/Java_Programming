//The index value and the value which is present there are both in the arr[2];

class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        int N=nums.length;
        while(i<N)
        {
            int val=nums[i];
            if(nums[i]!=i+1 && nums[i]!=nums[val-1])
            {
                swap(nums,i,val-1);
            }
            else
            {
                i++;
            }
        }
        int arr[]=new int[2];
        i=0;
        int k=0;
        while(i<N)
        {
            if(nums[i]!=i+1)
            {
                arr[k++]=nums[i];
                arr[k]=i+1;
                break;
            }
            i++;
        }
        return arr;
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
