class Solution {
    public int getMaximumGold(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]!=0)
                {
                    int curr=find(grid,i,j,new boolean[grid.length][grid[0].length]);
                    if(max<curr)
                    {
                        max=curr;
                    }
                }
            }
        }
        return max;
    }
    public static int find(int grid[][],int r,int c,boolean[][] visited)
    {
        if(r<0||c<0||r>=grid.length||c>=grid[0].length||visited[r][c]||grid[r][c]==0)
        {
            return 0;
        }
        visited[r][c]=true;
        int c1=find(grid,r,c-1,visited);
        int c2=find(grid,r,c+1,visited);
        int c3=find(grid,r-1,c,visited);
        int c4=find(grid,r+1,c,visited);
        visited[r][c]=false;
        return (Math.max(Math.max(c1,c2),Math.max(c3,c4))+grid[r][c]);
    }
}
