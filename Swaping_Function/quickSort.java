// First the arr given is passed into the partitionArray to partition the array for the HI index value 
// then from there the pivot index is taken as the split index and lo to pivotIndex-1 is passed to get sorted for it's HI value and same for pivotIndex+1 to hi


public static void quickSort(int arr[],int lo,int hi)
{
  if(lo>hi)
  {
    return;
  }
  int pivotValue=arr[hi];
  int splitIndex=partitionArray(arr,pivotValue,lo,hi);
  quickSort(arr,lo,splitIndex-1);
  quickSort(arr,splitIndex+1,hi);
}
public static int partitionArray(int arr[],int pivot,int lo,int hi)
{
  int i=lo;
  int j=lo;
  while(i<=hi)
  {
    if(arr[i]<=pivot)
    {
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      j++;
    }
    i++;
  }
  int pivotIndex=j-1;
  return pivotIndex;
}
