class Solution {
    public static Map<ArrayList<Integer>,Integer>m;
    public int minCost(int n, int[] cuts) {
        m=new HashMap<>();
        Arrays.sort(cuts);
        return find(0,n,cuts);
    }
    public static int find(int l,int r,int[] cuts)
    {
        int ans=Integer.MAX_VALUE;
        ArrayList<Integer> curr=new ArrayList<>();
        curr.add(l);
        curr.add(r);
        if(m.containsKey(curr))
        {
            return m.get(curr);
        }
        for(int i:cuts)
        {
            if(i<=l || i>=r)
                continue;
            int c1=find(l,i,cuts)+find(i,r,cuts);
            ans=Math.min(ans,(c1+(r-l)));
        }
        if(ans==Integer.MAX_VALUE)
        {
            ans=0;
        }
        m.put(curr,ans);
        return ans;
    }
}
