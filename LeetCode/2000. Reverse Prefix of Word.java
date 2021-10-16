class Solution {
    public String reversePrefix(String word, char ch) {
        int starting=find(word,ch);
        if(starting==0 || starting==-1)
        {
            return word;
        }
        word=reverse(word,starting);
        return word;
    }
    public static String reverse(String word,int end)
    {
        StringBuilder res=new StringBuilder(word.length());
        int i=end;
        while(i>=0)
        {
            res.append(word.charAt(i));
            i--;
        }
        i=end+1;
        while(i<word.length())
        {
            res.append(word.charAt(i));
            i++;
        }
        return res.toString();
    }
    public static int find(String word,char ch)
    {
        int idx=0;
        while(idx<word.length())
        {
            if(word.charAt(idx)==ch)
            {
                return idx;
            }
            idx++;
        }
        return -1;
    }
}
