class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[]=new int[9];
        for(int i=1;i<=9;i++)
        {
            arr[i-1]=i;
        }
        List<List<Integer>> result=new ArrayList<>();
        find(arr,n,k,0,result,new ArrayList<Integer>());
        return result;
    }
    public static void find(int arr[],int n,int k,int idx,List<List<Integer>> result,ArrayList<Integer> ans)
    {
        if(n==0 && k==0)
        {
            result.add(new ArrayList<Integer>(ans));
            return;
        }
        for(int i=idx;i<arr.length;i++)
        {
            if(arr[i]<=n)
            {
                ans.add(arr[i]);
                find(arr,n-arr[i],k-1,i+1,result,ans);
                ans.remove(ans.size()-1);
            }
        }
    }
}
