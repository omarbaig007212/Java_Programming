//Using swap(i,j);
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        find(nums,0,curr,res);
        return res;
    }
    public static void find(int nums[],int idx,ArrayList<Integer> curr,List<List<Integer>> res)
    {
        if(idx==nums.length)
        {
            ArrayList<Integer> curr1=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                curr1.add(nums[i]);
            }
            res.add(curr1);
            return;
        }
        for(int i=idx;i<nums.length;i++)
        {
            swap(nums,i,idx);
            find(nums,idx+1,curr,res);
            swap(nums,i,idx);
        }
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}







// Using Boolean Visited[] array;

class Solution {
    public List<List<Integer>> permute(int[] n) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> nums=new ArrayList<>();
        boolean[] visited=new boolean[n.length];
        for(int i:n)
        {
            nums.add(i);
        }
        find(nums,new ArrayList<Integer>(),res,visited);
        return res;
    }
    public static void find(ArrayList<Integer> nums,ArrayList<Integer> curr,List<List<Integer>> res,boolean visited[])
    {
        if(nums.size()==curr.size())
        {
            res.add(new ArrayList(curr));
            return;
        }
        for(int i=0;i<nums.size();i++)
        {
            if(visited[i])
            {
                continue;
            }
            int n=nums.get(i);
            curr.add(n);
            visited[i]=true;
            find(nums,curr,res,visited);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }
    }
}
