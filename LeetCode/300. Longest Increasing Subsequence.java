// Memoization dosn't work in this as the numbers are always increasing


class Solution {
//     public static Map<ArrayList<Integer>,Integer> m;
    public int lengthOfLIS(int[] nums) {
//         m=new HashMap<>();
        return find(nums,0,Integer.MIN_VALUE);
    }
    public static int find(int nums[],int idx,int prev)
    {
        if(idx==nums.length)
        {
            return 0;
        }
//         ArrayList<Integer> c=new ArrayList<>();
//         c.add(idx);
//         c.add(prev);
//         if(m.containsKey(c))
//         {
//             return m.get(c);
//         }
        int c1=0;
        if(prev<nums[idx])
        {
            c1=1+find(nums,idx+1,nums[idx]);
        }
        int c2=find(nums,idx+1,prev);
//         m.put(c,Math.max(c1,c2));
        return Math.max(c1,c2);
    }
}
