class Solution {
    public String toLowerCase(String s) {
        StringBuilder res=new StringBuilder(s.length());
        for(char c:s.toCharArray())
        {
            if(c>=65 && c<=90)
            {
                res.append((char)(c+32));
            }
            else
            {
                res.append(c);
            }
        }
        return res.toString();
    }
}
