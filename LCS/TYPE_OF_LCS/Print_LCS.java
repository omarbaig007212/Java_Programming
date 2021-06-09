import java.util.*;
public class Print_LCS {
    public static int t[][]=new int[1001][1001];
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);  
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=s1.length();
        int m=s2.length();
        for(int i=0;i<1001;i++)
            for(int j=0;j<1001;j++)
                t[i][j]=-1;
        int i=n;
        int j=m;
        int k=longestCommonSubsequence(s1,s2);
        char s[]=new char[k];
        while(i>0 && j>0)
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                k--;
                s[k]=s1.charAt(i-1);
                i--;
                j--;
            }
            else 
            {
                if(t[i-1][j]>t[i][j-1])
                    i--;
                else
                    j--;
            }
                
        for(int l=0;l<s.length;l++)
            System.out.print(s[l]);


    }
    public  static int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        for(int i=0;i<m+1;i++)
            t[0][i]=0;
        for(int i=0;i<n+1;i++)
            t[i][0]=0;
        for(int i=1;i<m+1;i++)
            for(int j=1;j<n+1;j++)
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    t[i][j]=1+t[i-1][j-1];
                else
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
        return t[m][n];
    }
}
