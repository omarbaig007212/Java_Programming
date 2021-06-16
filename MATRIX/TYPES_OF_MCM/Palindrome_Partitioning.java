import java.util.*;
public class Palindrome_Partitioning {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.println(solve(n, 0, n.length()-1));
    }
    public static int solve(String s,int i,int j)
    {
        if(i>=j)
            return 0;
        if(isPalindrome(s,i,j)==true)
            return 0;
        int min = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int temp=solve(s,i, k)+solve(s,k+1, j)+1;
            if(temp<min)
            {
                min=temp;
            }
        }
        return min;
    }
  public static boolean isPalindrome(String s,int i,int j)
  {
      StringBuilder str1= new StringBuilder(s);
        while(i<=j)
        {
            if(str1.charAt(i)!=str1.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
  }
}
