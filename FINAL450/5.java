//just move in any order to left or right
public static void main (String args[]) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // System.out.println(find(n));
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=scn.nextInt();
    }
    int pivot=0;
    int i=-1;
    int j=0;
    while(j<n)
    {
      if(arr[j]<pivot)
      {
        i++;
        swap(arr,i,j);
      }
      j++;
    }
    System.out.println(Arrays.toString(arr));
  }
  public static void swap(int arr[],int i,int j)
  {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }


//Move -ve to the last side element....
class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int i=0;
        int j=0;
        // int pivot=0;
        int temp[]=new int[n];
        while(i<n)
        {
            if(arr[i]>=0)
            {
                temp[j++]=arr[i];
            }
            i++;
        }
        if(j==n||j==0){
            return;
        }
        i=0;
        while(i<n)
        {
            if(arr[i]<0)
            {
                temp[j++]=arr[i];
            }
            i++;
        }
        for(int k=0;k<n;k++)
        {
            arr[k]=temp[k];
        }
    }
