import java.util.*;
public class Main{
    public static void main(String[]main)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        find(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void find(int[]arr)
    {
        if(arr.length==1)
        {
            return;
        }
        int temp[]=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++)
        {
            temp[i]=arr[i]+arr[i+1];
        }
        find(temp);
        System.out.println(Arrays.toString(temp));
    }
}
