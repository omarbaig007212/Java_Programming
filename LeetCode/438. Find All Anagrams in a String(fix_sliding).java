class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Character,Integer> hm=new HashMap<>();
        int count=0,i=0,j=0;
        for(char c:p.toCharArray())
        {
            if(hm.containsKey(c))
            {
                hm.put(c,hm.get(c)+1);
            }
            else
            {
                hm.put(c,1);
            }
        }
        count=hm.size();
        while(j<s.length())
        {
            char curr=s.charAt(j);
            if(hm.containsKey(curr))
            {
                hm.put(curr,hm.get(curr)-1);
                if(hm.get(curr)==0)
                {
                    count--;
                }
            }
            if((j-i+1)==p.length())
            {
                if(count==0)
                {
                    res.add(i);
                }
                char ith=s.charAt(i);
                if(hm.containsKey(ith))
                {
                    hm.put(ith,hm.get(ith)+1);
                    if(hm.get(ith)==1)
                    {
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        return res;
    }
}
