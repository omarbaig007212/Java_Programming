class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> hp=new HashMap<>();
        List a = new ArrayList();
        for(int i=0;i<p.length();i++)
        {
            if(hp.containsKey(p.charAt(i)))
            {
                hp.put(p.charAt(i),hp.get(p.charAt(i))+1);
            }
            else
            {
                hp.put(p.charAt(i),1);
            }
        }
        int i=0;
        int j=0;
        int count=hp.size();
        int k=p.length();
        while(j<s.length())
        {
            char ch=s.charAt(j);
            if(hp.containsKey(ch))
            {
                hp.put(ch,hp.get(ch)-1);
                if(hp.get(ch)==0)
                {
                    count--;
                }
            }
            if(j-i+1==k)
            {
                if(count==0)
                {
                    a.add(i);
                }
                if(hp.containsKey(s.charAt(i)))
                {
                    hp.put(s.charAt(i),hp.get(s.charAt(i))+1);
                    if(hp.get(s.charAt(i))==1)
                    {
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        return a;
    }
}
