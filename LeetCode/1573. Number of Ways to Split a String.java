// https://leetcode.com/problems/number-of-ways-to-split-a-string/
class Solution {
    public int numWays(String s) {
        long ones=0;
        long MOD=(int)1e9+7;
        long n=s.length();
        for(char c:s.toCharArray())
        {
            ones+=c-'0';
        }
        if(ones==0)
        {
            return (int)((((n-1)*(n-2))/2)%(int)MOD);
        }
        if(ones%3!=0)
        {
            return 0;
        }
        long oneThird=ones/3;
        ones=0;
        long ways1=0;
        long ways2=0;
        for(char c:s.toCharArray())
        {
            ones+=c-'0';
            if(ones==oneThird)
            {
                ways1++;
            }
            if(ones==2*oneThird)
            {
                ways2++;
            }
        }
        return (int)((ways1*ways2)%(int)MOD);
    }
}
