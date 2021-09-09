/* 
 given arr=[0,1,0] the low=0,end=2,mid=1; now arr[mid]>arr[mid+1]; which means mid can be a possible answer so... we move end to mid end=mid,
 if the arr[mid]<arr[mid+1] which means the right side is increasing and mid has no use so.. we update the start=mid+1;
*/


class Solution {
  public int peakIndexInMountainArray(int[] arr) {
      return find(arr);
  }
  public static int find(int[] arr)
  {
    int start=0;
    int end=arr.length-1;
    int mid=0;
    while(start<end)
    {
      mid=start+(end-start)/2;
      if(arr[mid]>arr[mid+1])
      {
        end=mid;
      }
      else
      {
        start=mid+1;
      }
    }
    return end;
  }
}
