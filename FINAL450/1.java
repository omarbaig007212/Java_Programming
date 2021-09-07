public static String reverseWord(String str)
    {
        // Reverse the string str
        char s[]=str.toCharArray();
        int i=0,j=s.length-1;
        while(i<j)
        {
            s[i]^=s[j];
            s[j]^=s[i];
            s[i]^=s[j];
            i++;
            j--;
        }
        str=new String(s);
        return str;
    }
