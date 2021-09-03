class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i=0,j=0,max=Integer.MIN_VALUE;
        ArrayList<Integer> val=new ArrayList<>();
        int arr[]=new int[nums.length-k+1];
        while(j<nums.length)
        {
            int curr=nums[j];
            while(val.size()>0 && nums[j]>val.get(val.size()-1))
            {
                val.remove(val.size()-1);
            }
            val.add(val.size(),curr);
            if((j-i+1)==k)
            {
                arr[i]=val.get(0);
                if(nums[i]==val.get(0))
                {
                    val.remove(0);
                }
                i++;
            }
            j++;
        }
        return arr;
    }
}
