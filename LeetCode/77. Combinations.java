class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        int arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=i;
        }
        find(arr,n,k,0,new ArrayList<>(),result);
        return result;
    }
    public static void find(int arr[],int n,int k,int idx,ArrayList<Integer> ans,List<List<Integer>> result)
    {
        if(k==0)
        {
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idx;i<arr.length;i++)
        {
            ans.add(arr[i]);
            find(arr,n,k-1,i+1,ans,result);
            ans.remove(ans.size()-1);
        }
    }
}
