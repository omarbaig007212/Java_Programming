class Solution {
    public static HashMap<Integer,Integer> hm;
    public int numSquares(int n) {
        hm=new HashMap<>();
        hm.put(0,0);
        return solve(n);
    }
    public static int solve(int n)
    {
        if(hm.containsKey(n))
        {
            return hm.get(n);
        }
        if(n<0) { return Integer.MAX_VALUE; }
        if(n==0) { return 0; }
        int min=n;
        for(int i=1;i*i<=n;i++)
        {
            min=Math.min(solve(n-(i*i)),min);
        }
        hm.put(n,min+1);
        return min+1;
    }
}
