class Solution {
    public boolean search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            //Removing start duplicates
            while(start<end && arr[start]==arr[start+1]){start++;}
            //Removing end duplicates
            while(start<end && arr[end]==arr[end-1]){end--;}
            
            //Checking mid
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            
            // Start Mid End
            // Checking if the left is unsorted
            if(arr[mid]<arr[start])
            {
                //If the target is >mid && <=end
                if(target>arr[mid] && target<=arr[end])
                {
                    start=mid+1;
                }
                //Else it's in left side
                else
                {
                    end=mid-1;
                }
            }
            
            
            //Checking if the right is not sorted
            else if(arr[mid]>arr[end])
            {
                //If it's in left
                if(target<arr[mid] && target>=arr[start])
                {
                    end=mid-1;
                }
                
                //Else in the right
                else
                {
                    start=mid+1;
                }
            }
            
            //If the array is sorted
            else
            {
                if(arr[mid]>target)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return false;
    }
}
