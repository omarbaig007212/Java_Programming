class Solution {
    public static char[][] res;
    public void solveSudoku(char[][] board) {
        res=new char[board.length][board[0].length];
        find(board,0,0,res);
        for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board[0].length;j++)
                {
                    board[i][j]=res[i][j];
                }
            }
    }
    public static void find(char[][] board,int r,int c,char[][] res)
    {
        if(r==board.length)
        {
            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board[0].length;j++)
                {
                    res[i][j]=board[i][j];
                }
            }
            return;
        }
        int nr=0;
        int nc=0;
        if(c==board[0].length-1)
        {
            nr=r+1;
            nc=0;
        }
        else
        {
            nc=c+1;
            nr=r;
        }
        if(board[r][c]!='.')
        {
            find(board,nr,nc,res);
        }
        else
        {
            for(int i=1;i<=9;i++)
            {
                if(isValid(board,r,c,i))
                {
                    board[r][c]=(char)(i+'0');
                    find(board,nr,nc,res);
                    board[r][c]='.';
                }
            }
        }
    }
    public static boolean isValid(char[][]board,int r,int c,int t)
    {
        for(int i=0;i<board.length;i++)
        {
          if(board[i][c]-'0'==t)
          {
              return false;
          }
        }
        for(int i=0;i<board[0].length;i++)
        {
          if(board[r][i]-'0'==t)
          {
              return false;
          }
        }
        r=(r/3)*3;
        c=(c/3)*3;
        for(int i=r;i<r+3;i++)
        {
            for(int j=c;j<c+3;j++)
            {
                  if(board[i][j]-'0'==t)
                  {
                      return false;
                  }
            }
        }
        return true;
    }
}
