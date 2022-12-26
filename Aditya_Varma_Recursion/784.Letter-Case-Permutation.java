class Solution {
    public static List<String> res;
    public List<String> letterCasePermutation(String s) {
        res=new ArrayList<>();
        StringBuilder curr=new StringBuilder(s);
        solve(s,0,curr);
        return res;
    }
    public static void solve(String s,int i,StringBuilder op)
    {
        if(i==s.length())
        {
            res.add(op.toString());
            return;
        }
        if(Character.isLetter(s.charAt(i)))
        {
            char temp=s.charAt(i);
            op.replace(i,i+1,Character.toUpperCase(temp)+"");
            solve(s,i+1,op);
            op.replace(i,i+1,Character.toLowerCase(temp)+"");
            solve(s,i+1,op);
            
        }
        else
        {
            solve(s,i+1,op);
        }
    }
}
