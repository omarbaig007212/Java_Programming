class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        for(int col=0;col<n;col++)
        {
            sortIt(mat,0,col);
        }
        for(int row=1;row<m;row++)
        {
            sortIt(mat,row,0);
        }
        return mat;
    }
    public static void sortIt(int mat[][],int row,int col)
    {
        // Using the PQ or ARRAYLIST
        int m=mat.length;
        int n=mat[0].length;
        // List<Integer> s=new ArrayList<>();
        // PriorityQueue<Integer> s=new PriorityQueue<>();
        int count[]=new int[101];
        int r=row;
        int c=col;
        while(r<m && c<n)
        {
            count[mat[r][c]]++;
            r++;
            c++;
        }
        r=row;
        c=col;
        
        for(int i=1;i<101;i++)
        {
            if(count[i]>0)
            {
                int val=count[i];
                while(val>0)
                {
                    mat[r][c]=i;
                    r++;
                    c++;
                    val--;
                }
            }
        }
        
        // Collections.sort(s);
//         while(r<m && c<n)
//         {
            
//             // mat[r][c]=s.poll();
//             r++;
//             c++;
//         }
    }
}
