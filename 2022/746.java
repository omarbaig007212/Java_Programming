//recursion

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(solve(cost,0),solve(cost,1));
    }
    public int solve(int[]cost,int x)
    {
        if(x==cost.length)
        {
            return 0;
        }
        if(x>cost.length)
        {
            return 10001;
        }
        return Math.min(cost[x]+solve(cost,x+1),cost[x]+solve(cost,x+2));
    }
}
