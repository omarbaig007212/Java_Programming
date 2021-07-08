import java.util.*;

import javax.swing.border.Border;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int board[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]=sc.nextInt();
            }
        }
        solve(board,0,0);
    }
    public static void display(int board[][])
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void solve(int board[][],int i,int j)
    {
        if(i==board.length)
        {
            //System.out.println("HEELL");
            display(board);
            return;
        }
        int ni=0;
        int nj=0;
        if(j==board[0].length-1)
        {
            ni=i+1;
            nj=0;
        }
        else
        {
            nj=j+1;
            ni=i;
        }
        if(board[i][j]!=0)
        {
            solve(board, ni, nj);
        }
        else
        {
            for(int val=1;val<=9;val++)
            {
                if(valid(board,i,j,val)==true)
                {
                    //System.out.println("HELLO");
                    board[i][j]=val;
                    solve(board, ni, nj);
                    board[i][j]=0;
                }
            }
        }
    }
    public static boolean valid(int board[][],int i,int j,int val)
    {
        for(int nj=0;nj<board[0].length;nj++)
        {
            if(board[i][nj]==val)
            {
                return false;
            }
        }
        for(int ni=0;ni<board.length;ni++)
        {
            if(board[ni][j]==val)
            {
                return false;
            }
        }
        
        int si=(i/3)*3;
        int sj=(j/3)*3;
        for(int i1=0;i1<3;i1++)
        {
            for(int j1=0;j1<3;j1++)
            {
                if(board[i1+si][j1+sj]==val)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
