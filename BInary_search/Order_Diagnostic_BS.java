public int find(int arr[],int target)
{
  int start=0;
  int end=arr.length-1;
  boolean isAsc=false;
  int mid=0;
  // If the end is larger than the starting 0th then it's ASCENDING else it's DESCENDING. (simple)........
  if(arr[end]>arr[start])
  {
    isAsc=true;
  }
  while(start<end)
  {
    mid=start+(end-start)/2;
    if(arr[mid]==target)
    {
      return mid;
    }
    if(isAsc)
    {
      if(arr[mid]>target)
      {
        start=mid+1;
      }
      else
      {
        end=mid-1;
      }
    }
    else
    {
      if(arr[mid]<target)
      {
        start=mid+1;
      }
      else
      {
        end=mid-1;
      }
    }
  }
}
