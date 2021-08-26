// Shekhar is a bomb defusal specialist. He once encountered a bomb that can be defused only by a secret code. He is given a number N and a number K. And he is also given permutation of first N natural numbers . The defusal code is the largest permutation possible by doing atmost K swaps among a pair of the given permutation. Help him to find the final permutation.

// Input Format
// First line contains ​an integer N and an integer k. The next line contains N space separated integers denoting the given permutation.

// Constraints
// 1 <= n <= 10^5
// 1<= K <= 10^9

// Output Format
// The final permutation of the numbers with every number separated by a space with other number.

// Sample Input
// 5 2
// 3 4 1 2 5
// Sample Output
// 5 4 3 2 1
// Explanation
// First we can swap 5 with 3 which gives us 5 4 1 2 3 and then we can swap 3 and 1 which gives us 5 4 3 2 1.







import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int K=sc.nextInt();
    int arr[]=new int[N+1];
    int index[]=new int[N+1];
    int i=1;
    for(i=1;i<=N;i++)
    {
      arr[i]=sc.nextInt();
      index[arr[i]]=i;
    }
    i=1;
    int temp=N;
    while((K!=0) && (i<=N))
    {
      if(arr[i]!=temp)
      {
        int pos=index[temp];
        index[arr[i]]=pos;
        int m=arr[i];
        arr[i]=arr[pos];
        arr[pos]=m;
        K--;
      }
      i++;
      temp--;
    }
    i=1;
    for(i=1;i<=N;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
