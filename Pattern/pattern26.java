import java.util.*;

public class Main {

  public static void main(String[] args) {
    pattern(6);
  }

  public static void pattern(int n) {
    for(int i=1;i<=6;i++)
    {
      for(int j=0;j<=n-i;j++)
      {
        System.out.print(i+" ");
      }
      System.out.println();
    }
  }
}
