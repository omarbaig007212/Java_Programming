class Solution {
    public String minWindow(String s, String t) {
        int j=0;
        int i=0;
        HashMap<Character,Integer>hp=new HashMap<>();
        while(j<t.length())
        {
            if(hp.containsKey(t.charAt(j)))
            {
                hp.put(t.charAt(j), hp.get(t.charAt(j)) + 1);
            }
            else
            {
                hp.put(t.charAt(j),1);
            }
            j++;
        }
        int count=hp.size();
        j=0;
        i=0;
        int k=Integer.MAX_VALUE;
        String ans="";
        while(j<s.length())
        {
            if(hp.containsKey(s.charAt(j)))
            {
                hp.put(s.charAt(j), hp.get(s.charAt(j)) - 1);
                if(hp.get(s.charAt(j))==0)
                {
                    count--;
                }
            }
            while(count==0 && i<=j)
            {
                if(k>j-i+1)
                {
                    k=j-i+1;
                    ans=s.substring(i,j+1);
                }
                if(hp.containsKey(s.charAt(i)))
                {
                    hp.put(s.charAt(i), hp.get(s.charAt(i)) + 1);
                    if(hp.get(s.charAt(i))==1)
                    {
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}
