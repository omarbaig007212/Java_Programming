class Solution {
    public void reverseString(char[] s) {
        // find(s,0,s.length-1);
        find(s,0);
    }
    // public static void find(char[]s,int i,int j)
    // {
    //     if(i>j)
    //     {
    //         return;
    //     }
    //     find(s,i+1,j-1);
    //     char temp=s[i];
    //     s[i]=s[j];
    //     s[j]=temp;
    // }
    
    public static void find(char[]s,int n)
    {
        if(n==s.length)
        {
            return;
        }
        char c=s[n];
        find(s,n+1);
        s[s.length-1-n]=c;
    }
}
