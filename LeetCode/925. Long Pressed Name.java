class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length())
        { return false; }
        int i=0,j=0;
        int len2=name.length();
        int len1=typed.length();
        while(j<len1)
        {
            char type1=typed.charAt(j);
            char name1=' ';
            if(i<len2)
            {
                name1=name.charAt(i);
            }
            if(i<len2 && name1==type1)
            {
                i++;
            }
            else if(j==0 || type1!=typed.charAt(j-1))
            {
                return false;
            }
            j++;
        }
        return i==len2;
    }
}
