import java.util.*;

public class Coin_Change_Maximun {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size_of_arr = sc.nextInt();
    int Coin[] = new int[size_of_arr];
    for (int i = 0; i < size_of_arr; i++) {
      Coin[i] = sc.nextInt();
    }
    int amount = sc.nextInt();
    System.out.println(CoinChange(Coin, amount));
  }

  public static int CoinChange(int wt[], int k) {
    int n = wt.length;
    int t[][] = new int[n + 1][k + 1];
    for (int i = 0; i < k + 1; i++) t[0][i] = 0;
    for (int i = 0; i < n + 1; i++) t[i][0] = 1;
    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < k + 1; j++) {
        if (wt[i - 1] <= j) {
          t[i][j] = t[i - 1][j] + t[i][j - wt[i - 1]];
        } else {
          t[i][j] = t[i - 1][j];
        }
      }
    }
    return t[n][k];
  }
}
