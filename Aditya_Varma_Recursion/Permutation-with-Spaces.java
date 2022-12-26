class Solution{
    public static ArrayList<String> res;
    ArrayList<String> permutation(String s){
        res=new ArrayList<>();
        String op=""+s.charAt(0);
        s=s.substring(1,s.length());
        solve(s,op,0);
        return res;
    }
    public static void solve(String ip,String op,int j)
    {
        if(j==ip.length())
        {
            res.add(op);
            return;
        }
        solve(ip,op+" "+ip.charAt(j),j+1);
        solve(ip,op+ip.charAt(j),j+1);
    }
}
