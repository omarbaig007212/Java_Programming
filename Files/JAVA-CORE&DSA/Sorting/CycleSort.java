import java.util.*; 
public class CycleSort{
	public static void main(String[] args) {
		int arr[]=new int[]{3,5,2,1,4};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[]arr)
	{
		int i=0;
		while(i<arr.length)
		{
			if((i+1)!=arr[i])
			{
				int temp=arr[arr[i]-1];
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
			}
			else
			{
				i++;
			}
		}
	}
}