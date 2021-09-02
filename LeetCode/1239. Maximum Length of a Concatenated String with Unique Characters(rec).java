// Used both HashMap and ArrayList but both are slow , even memoization using hashmap is slow compared to the int[] 


class Solution {
    public int maxLength(List<String> arr) {
        int res[]=new int[1];
        find(arr,0,"",res);
        return res[0];
    }
    public static void find(List<String> arr,int idx,String s,int[]res)
    {
        if(idx==arr.size())
        {
            int uC=uniqueC(s);
            if(uC>res[0])
            {
                res[0]=uC;
            }
            return;
        }
        find(arr,idx+1,s+arr.get(idx),res);
        find(arr,idx+1,s,res);
    }
    public static int uniqueC(String s)
    {
        int count[]=new int[26];
        for(char c:s.toCharArray())
        {
            count[c-'a']++;
            if(count[c-'a']> 1)
            {
                return -1;
            }
        }
        return s.length();
    }
}
