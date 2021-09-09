import java.util.Scanner;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/#:~:text=So%20in%20order%20to%20find,and%20double%20the%20high%20index.
public class Main{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    System.out.println(findPos(arr,target));
  }
  public static int findPos(int arr[],int target)
  {
    int start=0;
    int end=1;
    while(target>arr[end])
    {
      start=end;
      if(2*end<arr.length)
      {
        end=end*2;
      }
      else
      {
        end=arr.length-1;
      }
    }
    return find(arr,target,start,end);
  }
  public static int find(int arr[],int target,int start,int end)
  {
    int mid=0;
    while(start<=end)
    {
      mid=start+(end-start)/2;
      if(arr[mid]<target)
      {
        start=mid+1;
      }
      else if(arr[mid]>target)
      {
        end=mid-1;
      }
      else
      {
        return mid;
      }
    }
    return -1;
  }
}
