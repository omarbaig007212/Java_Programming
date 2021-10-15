class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int len=s.length();
        int j=len-1;
        while(i<j)
        {
            char val1=s.charAt(i);
            char val2=s.charAt(j);
            if(val1!=val2)
            {
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean isPalindrome(String s,int i,int j)
    {
        while(i<j)
        {
            char val1=s.charAt(i);
            char val2=s.charAt(j);
            if(val1!=val2)
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
