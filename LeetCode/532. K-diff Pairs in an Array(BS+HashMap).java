class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(search(nums,i+1,nums.length-1,k+nums[i])>=0)
            {
                s.add(nums[i]);
            }
        }
        return s.size();
    }
    public static int search(int[] nums,int low,int high,int target)
    {
        int k=-1;
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(nums[mid]>target)
            {
                high=mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                k=mid;
                break;
            }
        }
        return k;
    }
}





//HashMap------------------------------->>>>>>>>>>>>>>>>
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        int count=0;
        if(k==0)
        {
            for(int keys:hm.keySet())
            {
                if(hm.get(keys)>1)
                {
                    count++;
                }
            }
        }
        else
        {
            for(int keys:hm.keySet())
            {
                int t=keys+k;
                if(hm.containsKey(t))
                {
                    count++;
                }
            }
        }
        return count;
    }
}
