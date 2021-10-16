class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return confirm(a,b)||confirm(b,a);
    }
    public static boolean confirm(String a,String b){
        int i=0;
        int j=b.length()-1;
        while(i<j)
        {
            if(a.charAt(i)!=b.charAt(j))
            {
                break;
            }
            i++;
            j--;
        }
        return isValid(a,i,j) || isValid(b,i,j);
    }
    public static boolean isValid(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                break;
            }
            i++;
            j--;
        }
        return i>=j;
    }
}

//TLE
// class Solution {
//     public boolean checkPalindromeFormation(String a1, String b1) {
//         StringBuilder a=new StringBuilder(a1);
//         StringBuilder b=new StringBuilder(b1);
//         if(isValid(a.toString()) || isValid(b.toString()))
//         {
//             return true;
//         }
//         for(int i=0;i<a.length();i++)
//         {
//             String s1=a.substring(0,i)+b.substring(i,b.length());
//             String s2=b.substring(0,i)+a.substring(i,a.length());
//             if(isValid(s1) || isValid(s2))
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static boolean isValid(String s)
//     {
//         int i=0;
//         int j=s.length()-1;
//         while(i<j)
//         {
//             if(s.charAt(i)!=s.charAt(j))
//             {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
// }
