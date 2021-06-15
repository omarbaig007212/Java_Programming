import java.util.*;
public class MCM_RECURSIVE {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(solve(arr, 1, n-1));
        System.out.println(min);
    }
    static int min = Integer.MAX_VALUE;
    public static int solve(int arr[],int i,int j)
    {
        if(i>=j)
            return 0;
        for(int k=i;k<=j-1;k++)
        {
            int temp=solve(arr,i, k)+solve(arr,k+1, j)+arr[i-1]*arr[k]*arr[j];
            if(temp<min)
            {
                min=temp;
            }
        }
        return min;
    }
}
