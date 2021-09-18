/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        //The array is continous before and after the pivot index;
        int pivotIdx=findPivot(mountainArr);
        //Searching in the left side as the array is ASCENDING;
        int asc=BS(mountainArr,0,pivotIdx,target);
        //If the asc!=-1 then return that we found the value;
        if(asc!=-1)
        {
            return asc;
        }
        //If not found int ASC order try the other half; if not it will return -1;
        int desc=BS(mountainArr,pivotIdx,mountainArr.length()-1,target);
        return desc;
    }
    //Doing BS on the array;
    public static int BS(MountainArray mountainArr,int start,int end,int target)
    {
        boolean ASC=false;
        if(mountainArr.get(start)<mountainArr.get(end))
        {
            ASC=true;
        }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)==target)
            {
                return mid;
            }
            if(ASC)
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
    //The mid>mid+1; means mid is a possible answer;
    public static int findPivot(MountainArray mountainArr)
    {
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1))
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
}
