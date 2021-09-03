class Solution {
    public String reverseWords(String s) {
        StringBuilder oldS=new StringBuilder(s);
        StringBuilder newS=new StringBuilder();
        int i=0,j=oldS.length()-1;
        while(j>=0)
        {
            if(oldS.charAt(j)==' ')
            {
                j--;
            }
            else
            {
                i=j;
                while(j>=0 && oldS.charAt(j)!=' ')
                {
                    j--;
                }
                if(newS.length()==0)
                {
                    newS.append(oldS.substring(j+1,i+1));
                }
                else
                {
                    newS.append(' ');
                    newS.append(oldS.substring(j+1,i+1));
                }
            }
        }
        return newS.toString();
    }
}
