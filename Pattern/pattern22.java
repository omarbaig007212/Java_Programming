import java.util.*;

public class Main {

  public static void main(String[] args) {
    pattern(5);
  }

  public static void pattern(int n) {
    int count=1;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<=i;j++)
      {
        System.out.print(count%2+" ");
        count++;
      }
      if(i%2==0)
      {
        count=0;
      }
      else
      {
        count=1;
      }
      System.out.println();
    }
  }
}
