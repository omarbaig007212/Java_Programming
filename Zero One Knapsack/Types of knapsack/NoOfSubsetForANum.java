import java.util.*;

public class NoOfSubsetForANum {
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
        for(int i=0;i<k+1;i++)
            t[0][i]=0;
        for(int i=0;i<n+1;i++)
            t[i][0]=1;
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
