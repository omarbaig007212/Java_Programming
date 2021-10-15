class Solution {
    public boolean isPalindrome(String s) {
        int len=s.length();
        StringBuilder res=new StringBuilder(len);
        for(int i=0;i<len;i++)
        {
            char temp=s.charAt(i);
            if(Character.isLetterOrDigit(temp))
            {
                if(temp>=65 && temp<=90)
                {
                    res.append((char)(temp+32));
                }
                else
                {
                    res.append(temp);
                }
            }
        }
        StringBuilder resR=new StringBuilder(res);
        resR.reverse();
        // System.out.println(resR.toString() + " " + res.toString());
        for(int i=0;i<resR.length();i++)
        {
            if(resR.charAt(i)!=res.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}
