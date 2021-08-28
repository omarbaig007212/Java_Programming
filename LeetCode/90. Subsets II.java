class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        find(0,nums,ans,res);
        return res;
    }
    public static void find(int idx,int arr[],ArrayList<Integer> ans,List<List<Integer>> res)
    {
        if(!res.contains(new ArrayList(ans)))
        {
            res.add(new ArrayList(ans));
        }
        for(int i=idx;i<arr.length;i++)
        {
            ans.add(arr[i]);
            find(i+1,arr,ans,res);
            ans.remove(ans.size()-1);
        }
    }
}
