class Solution {
    public static int dp[][];
    public int minPathSum(int[][] grid) {
        dp=new int[grid.length][grid[0].length];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }
        return find(grid,0,0,grid.length,grid[0].length);
    }
    public static int find(int[][]grid,int i,int j,int n,int m)
    {
        if(i==n-1 && j==m-1)
        {
            return grid[i][j];
        }
        if(i>=n || j>=m)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        return dp[i][j]=grid[i][j]+Math.min(find(grid,i,j+1,n,m),find(grid,i+1,j,n,m));
    }
}
