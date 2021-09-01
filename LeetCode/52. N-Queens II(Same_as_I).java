class Solution {
    public static int res;
    public int totalNQueens(int n) {
        int board[][]=new int[n][n];
        res=0;
        find(board,0);
        return res;
    }
    public static void find(int board[][],int r)
    {
        if(r==board.length)
        {
            res++;
            return;
        }
        for(int col=0;col<board[0].length;col++)
        {
            if(!isVisited(board,r,col))
            {
                board[r][col]=1;
                find(board,r+1);
                board[r][col]=0;
            }
        }
    }
    public static boolean isVisited(int board[][],int r,int c)
    {
        for(int i=r-1,j=c;i>=0;i--)
        {
            if(board[i][j]==1)
            {
                return true;
            }
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0;j--,i--)
        {
            if(board[i][j]==1)
            {
                return true;
            }
        }
        for(int i=r-1,j=c+1;i>=0 && j<board[0].length;j++,i--)
        {
            if(board[i][j]==1)
            {
                return true;
            }
        }
        return false;
    }
}
