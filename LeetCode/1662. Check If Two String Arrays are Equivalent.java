class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i=0;
        int j=0;
        StringBuilder text1=new StringBuilder();
        while(i<word1.length)
        {
            text1.append(word1[i]);
            i++;
        }
        int count=0;
        while(j<word2.length)
        {
            int k=0;
            String word=word2[j];
            while(k<word.length())
            {
                if(count==text1.length() || text1.charAt(count++)!=word.charAt(k)){return false;}
                k++;
            }
            j++;
        }
        if(count!=text1.length())
        {
            return false;
        }
        return true;
    }
}
