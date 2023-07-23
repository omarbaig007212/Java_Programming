import java.util.*;

public class MergeSort{
	public static MergeTwoSortedArray sort = new MergeTwoSortedArray();
	public static int[] solve(int[]arr,int left,int right)
	{
		if(left == right)
		{
			return new int[]{arr[left]};
		}
		int mid=left+(right-left)/2;
		int arr1[] = solve(arr,left,mid);
		int arr2[] = solve(arr,mid+1,right);
		return sort.solve(arr1,arr2);
	}
	public static void main(String[]args){
		int arr[]=new int[]{3,4,5,1,2};
		int arr3[]=solve(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr3));
	}
}