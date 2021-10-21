import java.util.*;

public class Main {

  public static void main(String[] args) {
    pattern(4);
  }

  public static void pattern(int n) {
    int count = n;
    for (int i = 1; i < 2 * n; i++) {
      int c = i > n ? 2 * n - i : i;
      if (i <= n) {
        count--;
      } else {
        count++;
      }
      for (int j = 1; j <= count; j++) {
        System.out.print(" ");
      }
      for (int j = c; j >= 1; j--) {
        System.out.print(j);
      }
      for (int j = 2; j <= c; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
