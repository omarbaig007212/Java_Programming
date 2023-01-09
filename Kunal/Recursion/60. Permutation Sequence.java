class Solution {
    public static String res;
    public String getPermutation(int n, int k) {
        k=k-1;
        res="";
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=1;i<=n;i++) { arr.add(i); }
        solve(arr,k);
        return res;
    }
    public static void solve(ArrayList<Integer> arr,int k)
    {
        int fact=fact(arr.size()-1);
        int temp=k/fact;
        res+=arr.get(temp);
        arr.remove(temp);
        if(arr.size()==0)
        {
            return;
        }
        k=k%fact;
        solve(arr,k);
    }
    public static int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}
