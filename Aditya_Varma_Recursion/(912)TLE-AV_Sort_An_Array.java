class Solution {
    public int[] sortArray(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int x:nums)
        {
            arr.add(x);
        }
        arr=solve(arr);
        for(int i=0;i<arr.size();i++)
        {
            nums[i]=arr.get(i);
        }
        return nums;
    }
    public static ArrayList solve(ArrayList<Integer> arr)
    {
        if(arr.size()==1)
        {
            return arr;
        }
        int toAdd= arr.get(arr.size()-1); 
        arr.remove(arr.size()-1);
        solve(arr);
        sort(arr,toAdd);
        return arr;
    }
    public static ArrayList sort(ArrayList<Integer> arr,int toAdd)
    {
        if(arr.size()==0 || arr.get(arr.size()-1)<=toAdd)
        {
            arr.add(toAdd);
            return arr;
        }
        int temp=arr.get(arr.size()-1); 
        arr.remove(arr.size()-1);
        sort(arr,toAdd);
        arr.add(temp);
        return arr;
    }
}
