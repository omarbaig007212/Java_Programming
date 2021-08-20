import java.util.*;

public class Coin_Change_Minimum {

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
    for (int i = 0; i < k + 1; i++) t[0][i] = Integer.MAX_VALUE-1;
    for (int i = 1; i < n + 1; i++) t[i][0] = 0;
    for (int i = 1; i < k + 1; i++){
        if(i%wt[0]==0)
        {
            t[1][i]=i/wt[0];
        }
        else{
            t[1][i]=Integer.MAX_VALUE-1;
        }
    }
    for (int i = 2; i < n + 1; i++) {
      for (int j = 1; j < k + 1; j++) {
        if (wt[i - 1] <= j) {
          t[i][j] = Math.min((1+t[i][j - wt[i - 1]]),(t[i-1][j]));
        } else {
          t[i][j] = t[i - 1][j];
        }
      }
    }
    return t[n][k];
  }
}
