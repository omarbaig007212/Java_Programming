class Solution {
  public int findInMountainArray(int target, MountainArray mountainArr) {
    int peakIdx=findPeak(mountainArr);
    int asc=findInBS(mountainArr,target,0,peakIdx);
    if(asc!=-1)
    {
      return asc;
    }
    int dsc=findInBS(mountainArr,target,peakIdx,mountainArr.length()-1);
    return dsc;
  }
  public static int findPeak(MountainArray mountainArr)
  {
    int start=0,end=mountainArr.length()-1,mid=0;
    while(start<end)
    {
      mid=start+(end-start)/2;
      if(mountainArr.get(mid)>mountainArr.get(mid+1))
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
  public static int findInBS(MountainArray mountainArr,int target,int start,int end)
  {
    int mid=0;
    boolean isAsc=false;
    if(mountainArr.get(end)>mountainArr.get(start))
    {
      isAsc=true;
    }
    while(start<=end)
    {
      mid=start+(end-start)/2;
      if(mountainArr.get(mid)==target)
      {
        return mid;
      }
      if(isAsc)
      {
        if(mountainArr.get(mid)>target)
        {
          end=mid-1;
        }
        else
        {
          start=mid+1;
        }
      }
      else
      {
        if(mountainArr.get(mid)<target)
        {
          end=mid-1;
        }
        else
        {
          start=mid+1;
        }
      }
    }
    return -1;
  }
}
