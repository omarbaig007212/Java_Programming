class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int N=intervals.length;
        int first[]=new int[N];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            first[i]=intervals[i][0];
            hm.put(first[i],i);
        }
        //Sort the "first" to apply BS;
        Arrays.sort(first);
        
        //Result array for i=0->N store the values;
        int res[]=new int[N];
        //Now get the values [i][1] and compare over the "first"
        for(int i=0;i<N;i++)
        {
            int val=intervals[i][1];
            int curr=BS(first,val);
            //If the index of curr is greater than the total size or equal then it's not in the array
            if(curr==N)
            {
               res[i]=-1; 
            }
            //If the curr=0 that means either all the elements are bigger than val or length is 1||0
            else if(curr==0)
            {
                if(val<=first[0])
                {
                    res[i]=hm.get(first[0]);
                }
                //The values are all not comparable
                else
                {
                    res[i]=-1;
                }
            }
            //Else the value is in btw 0 and N 
            else
            {
                res[i]=hm.get(first[curr]);
            }
        }
        return res;
    }
    public static int BS(int[]arr,int t)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>=t)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
}
