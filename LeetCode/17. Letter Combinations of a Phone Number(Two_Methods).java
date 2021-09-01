class Solution {
    
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0)
        {
            return res;
        }
        find(res,digits,"",0);
        return res;
    }
    public static String[] l={
        "0",
        "1",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    public static void find(List<String> res,String digit,String curr,int idx)
    {
        
        if(idx==digit.length())
        {
            res.add(curr);
            return;
        }
        String s=l[digit.charAt(idx)-'0'];
        for(int i=0;i<s.length();i++)
        {
            find(res,digit,curr+s.charAt(i),idx+1);
        }
    }
}



//Samee time as above
class Solution {
    public static HashMap<Integer,String> hm;
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        hm=new HashMap<>();
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        if(digits==null || digits.length()==0)
        {
            return res;
        }
        find(res,digits,"",0);
        return res;
    }
    public static void find(List<String> res,String digit,String curr,int idx)
    {   
        if(idx==digit.length())
        {
            res.add(curr);
            return;
        }
        String s=hm.get(digit.charAt(idx)-'0');
        for(int i=0;i<s.length();i++)
        {
            find(res,digit,curr+s.charAt(i),idx+1);
        }
    }
}
