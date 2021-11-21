import java.util.*;
public class Main{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int arr[]=new int[N];
      for(int i=0;i<N;i++)
      {
         arr[i]=sc.nextInt();
      }
      find(arr,0);
      System.out.println(Arrays.toString(arr));
   }
   // public static void find(int[]arr)
   // {
   //    for(int i=0;i<arr.length-1;i++)
   //    {
   //       for(int j=0;j<arr.length-i-1;j++)
   //       {
   //          if(arr[j]>arr[j+1])
   //          {
   //             int temp=arr[j];
   //             arr[j]=arr[j+1];
   //             arr[j+1]=temp;
   //          }
   //       }
   //    }
   // }
   public static void find(int[]arr,int n)
   {
      if(n==arr.length-1)
      {
         return;
      }
      for(int j=0;j<arr.length-n-1;j++)
      {
         if(arr[j]>arr[j+1])
         {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
         }
      }
      find(arr,n+1);
   }
}
