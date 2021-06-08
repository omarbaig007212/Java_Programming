import java.util.*;

public class TargetSumForLeetCode {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int wt[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            wt[i]=sc.nextInt();
            sum+=wt[i];
        }
        int diff=sc.nextInt();
        int find=(sum+diff)/2;
        System.out.println(SumOfSubset(wt,find));
    }
    public static int SumOfSubset(int arr[],int k)
    {
        int n=arr.length;
        int t[][]=new int[n+1][k+1];
        //initilization
        t[0][0]=1;
        for(int i=0;i<n+1;i++)
         
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<k+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    t[i][j]=t[i-1][j]+t[i-1][j-arr[i-1]];
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][k];
    }
}

//LEET CODE ANSWER HERE!
// class Solution {
//     public int findTargetSumWays(int[] arr, int target) {
//         int n=arr.length;
//         if(n==1)
//         {
//             if(target==arr[n-1] || target<0)
//                 return 1;
//             else 
//                 return 0;
//         }
//         int sum=0;
//         for(int i=0;i<n;i++)
//         {
//             sum+=arr[i];
//         }
//         if ((sum + target) % 2 != 0)
// 		    return 0;
//         sum=(sum+target)/2;
        
//         int t[][]=new int[n + 1][sum + 1]; // DP - matrix
//         // initialization
//         t[0][0] = 1;
//         int k = 1;
//         for (int i = 0; i <= n; i++) {
//             for (int j = 0; j <= sum; j++) {
//                 if (i == 0 && j > 0)
//                     t[i][j] = 0;
//                 if (j == 0 && i > 0) {
//                     if (arr[i - 1] == 0) {
//                         t[i][j] = (int)Math.pow(2, k);
//                         k++;
//                     }
//                     else
//                         t[i][j] = t[i - 1][j];
//                 }
//             }
//         }

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= sum; j++) {
//                 if (arr[i - 1] <= j)
//                     t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
//                 else
//                     t[i][j] = t[i - 1][j];
//             }
//         }

//         return t[n][sum];
//     }
// }
