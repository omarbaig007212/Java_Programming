import java.util.*;
public class Main{
  public static void main(String[]args)
  {
    pattern(5);
  }
  public static void pattern(int n)
  {
    for(int i=1;i<=n;i++)
    {
      int j=1;
      for(;j<=n-i;j++)
      {
        System.out.print(" ");
      }
      int count=0;
      for(;j<=n;j++)
      {
        System.out.print("*");
        count++;
      }
      for(j=1;j<count;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
