class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        for(char i[]:board)
        {
            Arrays.fill(i,'.');
        }
        ArrayList<String> s=new ArrayList<>();
        List<List<String>> res=new ArrayList<>();
        find(board,s,0,res);
        return res;
    }
    public static void find(char board[][],ArrayList<String> s,int r,List<List<String>> res)
    {
        if(r==board.length)
        {
            res.add(new ArrayList(s));
            System.out.println(s);
            return;
        }
        for(int col=0;col<board[0].length;col++)
        {
            if(!isVisited(board,r,col))
            {
                board[r][col]='Q';
                StringBuilder s1=new StringBuilder();
                for(int i=0;i<board.length;i++)
                {
                    s1.append(board[r][i]);
                }
                s.add(s1.toString());
                find(board,s,r+1,res);
                s.remove(s.size()-1);
                board[r][col]='.';
            }
        }
    }
    public static boolean isVisited(char board[][],int r,int c)
    {
        for(int i=r-1,j=c;i>=0;i--)
        {
            if(board[i][j]=='Q')
            {
                return true;
            }
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0;j--,i--)
        {
            if(board[i][j]=='Q')
            {
                return true;
            }
        }
        for(int i=r-1,j=c+1;i>=0 && j<board[0].length;j++,i--)
        {
            if(board[i][j]=='Q')
            {
                return true;
            }
        }
        return false;
    }
}
