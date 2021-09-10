// Just do cyclic_sort and if val!=i+1, then add it in the arraylist;


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        int N=nums.length;
        List<Integer> a=new ArrayList<>();
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
        i=0;
        while(i<N)
        {
            if(nums[i]!=i+1)
            {
                a.add(nums[i]);
            }
            i++;
        }
        return a;
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
