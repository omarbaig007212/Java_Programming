log10(n) will return the number as 1.07 with +1 we get the ceil and done answer.


class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums)
        {
            if(find(i))
            {
                count++;
            }
        }
        return count;
    }
    public static boolean find(int n)
    {
        if(n<0)
        {
            n=n*-1;
        }
        int ans=(int)Math.log10(n)+1;
        return ans%2==0?true:false;
    }
}
