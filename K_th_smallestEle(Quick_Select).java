1. You are given an array(arr) of integers.
2. You have to find the k-th smallest element in the given array using the quick-select algorithm.
  
  
  public static int quickSelect(int[] arr, int lo, int hi, int k) {
    //write your code here
    int pivotIdx=arr[hi];
    int j=partition(arr,pivotIdx,lo,hi);
    if(j<k)
    {
        return quickSelect(arr,j+1,hi,k);
    }
    else if(j>k)
    {
        return quickSelect(arr,lo,j-1,k);
    }
    else
    {
        return arr[j];
    }
  }

  public static int partition(int[] arr, int pivot, int lo, int hi) {
    System.out.println("pivot -> " + pivot);
    int i = lo, j = lo;
    while (i <= hi) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
    System.out.println("pivot index -> " + (j - 1));
    return (j - 1);
  }
