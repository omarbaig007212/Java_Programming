class Solution {
    public int findKthLargest(int[] nums, int large) {
        if(nums.length==1 || large==0)
        {
            return nums[0];
        }
      HashMap<Integer,Integer> hm=new HashMap<>();
      int min=0;
      int k=1;
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++)
      {
        if(hm.containsKey(nums[i]))
        {
            hm.put(k,nums[i]);
            k++;
        }
        else
        {
            hm.put(k,nums[i]);
            k++;
        }
      }
      large=(hm.size()-large)%hm.size();
        large++;
      return hm.get(large);
    }
}
