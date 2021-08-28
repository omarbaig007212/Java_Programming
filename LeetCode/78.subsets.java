class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        find(0,nums,curr,res);
        return res;
    }
    public static void find(int idx,int arr[],ArrayList<Integer> curr,List<List<Integer>> res)
    {
        res.add(new ArrayList(curr));
        for(int i=idx;i<arr.length;i++)
        {
            curr.add(arr[i]);
            find(i+1,arr,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}
