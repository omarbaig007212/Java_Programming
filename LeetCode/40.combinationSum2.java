class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(candidates);
        find(candidates,target,0,ans,result);
        return result;
    }
    public static void find(int arr[],int k,int idx,ArrayList<Integer> ans,List<List<Integer>> result)
    {
        if(k==0)
        {
            result.add(new ArrayList<>(ans));
            return;
        }
        if(k<0)
        {
            return;
        }
        for(int i=idx;i<arr.length;i++)
        {
            if(i==idx || arr[i-1]!=arr[i])
            {
                ans.add(arr[i]);
                find(arr,k-arr[i],i+1,ans,result);
                ans.remove(ans.size()-1);
            }
        }
    }
}
