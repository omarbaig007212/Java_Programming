//Time ~~ 4ms

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        boolean visited[]=new boolean[nums.length];
        Arrays.sort(nums);
        find(nums,curr,res,visited);
        return res;
    }
    public static void find(int[] nums,ArrayList<Integer> curr,List<List<Integer>> res,boolean[] visited)
    {
        if(nums.length==curr.size())
        {
           
                res.add(new ArrayList(curr));
            
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i])
            {
                continue;
            }
            if(i>0 && nums[i-1]==nums[i] && visited[i-1]==true)
            {
                continue;
            }
            curr.add(nums[i]);
            visited[i]=true;
            find(nums,curr,res,visited);
            visited[i]=false;
            curr.remove(curr.size()-1);
        }
    }
}



///////// time~~~ 550 ms

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        boolean visited[]=new boolean[nums.length];
        Arrays.sort(nums);
        find(nums,curr,res,visited);
        return res;
    }
    public static void find(int[] nums,ArrayList<Integer> curr,List<List<Integer>> res,boolean[] visited)
    {
        if(nums.length==curr.size())
        {
            if(!res.contains(curr))
            {
                res.add(new ArrayList(curr));
            }
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i])
            {
                continue;
            }
            curr.add(nums[i]);
            visited[i]=true;
            find(nums,curr,res,visited);
            visited[i]=false;
            curr.remove(curr.size()-1);
        }
    }
}
