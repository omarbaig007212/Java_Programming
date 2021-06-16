import java.util.*;
public class Palindrome_Partitioning {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.println(solve(n, 0, n.length()-1));
    }
    static int min = Integer.MAX_VALUE;
    public static int solve(String s,int i,int j)
    {
        if(i>=j)
            return 0;
        if(isPalindrome(s,i,j)==true)
            return 0;
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
      int flag=0;
      while(i<=j)
      {
        if(s.charAt(i)!=s.charAt(j))
        {
            flag=1;
            break;
        }
        i++;
        j--;
      }
      if(flag==1)
      {
          return false;
      }
      return true;
  }
}
