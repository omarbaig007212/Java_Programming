class Solution {
    public int reachNumber(int target) {
        target=Math.abs(target);
        int step=0;
        int sum=0;
        //Calculation of sum+step where step=i or 1,2,3,4,5,...,N 
        while(sum<target)
        {
            //Will break at >= target
            step++;
            sum+=step;
        }
        
        //If the sum-target%2==0 then for example: 
        // target=5;
        // sum=1+2+3+4 (break) now sum-target%2!=0 then increase the sum with step
        // sum=1+2+3+4+5 now sum-target%2==0 then flip of signs + to -ve or -ve to +ve will result in target
        while((sum-target)%2!=0)
        {
            step++;
            sum+=step;
        }
        return step;
    }
}
