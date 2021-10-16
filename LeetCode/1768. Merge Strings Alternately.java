class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        int len1=word1.length();
        int len2=word2.length();
        StringBuilder res=new StringBuilder(len1+len2);
        while(i<len1 && j<len2)
        {
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }
        while(i<len1)
        {
            res.append(word1.charAt(i++));
        }
        while(j<len2)
        {
            res.append(word2.charAt(j++));
        }
        return res.toString();
    }
}
