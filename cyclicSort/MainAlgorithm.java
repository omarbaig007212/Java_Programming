// If the value at arr[i] is not equal to i+1 or example arr=[1,2,3] here i=0; and arr[i]=1; arr[i]==i+1; yes?i++:swap(i,arr[i]-1); 
// Worst:Case:O(n); Best:Case:O(n);


import java.util.*;
public class Main{
  public static void main(String[]args)
  {
    int arr[]={3,5,2,1,4};
    cyclicsort(arr);
  }
  public static void cyclicsort(int arr[])
  {
    int N=arr.length;
    int i=0;
    while(i<N)
    {
      int val=arr[i];
      if(val==i+1)
      {
        i++;
      }
      else
      {
        swap(arr,val-1,i);
      }
    }
    System.out.println(Arrays.toString(arr));
  }
  public static void swap(int arr[],int i,int j)
  {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
}
