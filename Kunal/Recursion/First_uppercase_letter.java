import java.util.*;
public class Main{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String S=sc.next();
      // for(int i=0;i<s.length();i++)
      // {
      //    if(Character.isUpperCase(s.charAt(i)))
      //    {
      //       System.out.println(s.charAt(i));
      //       break;
      //    }
      // }

      find(S,0);
   }
   public static void find(String S ,int i)
   {
      if(i==S.length())
      {
         return;
      }
      if(Character.isUpperCase(S.charAt(i)))
      {
         System.out.println(S.charAt(i));
         return;
      }
      find(S,i+1);
   }
}
