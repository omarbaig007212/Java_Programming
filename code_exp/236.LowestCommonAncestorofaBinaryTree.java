/*
The Problem was with the compaision Operator
 The working one : """while(i >= 0 && j >= 0 && p1.get(i) == p2.get(j)){
          i--;
          j--;
        }
        """
 The Not-Working one: """
 while(i >= 0 && j >= 0){
  if( p1.get(i) != p2.get(j))
  {
    break;
   }
    i--;
    j--;
  }
 """
*/
class Solution {
    static ArrayList<TreeNode> a1;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        a1=new ArrayList<>();
        nodetoroot(root,p);
        ArrayList<TreeNode> p1=a1;
        a1=new ArrayList<>();
        nodetoroot(root,q);
        ArrayList<TreeNode> p2=a1;
        a1=new ArrayList<>();
        TreeNode res=root;
        int i = p1.size() - 1;
        int j = p2.size() - 1;

        while(i >= 0 && j >= 0 && p1.get(i) == p2.get(j)){
          i--;
          j--;
        }
        res=p1.get(i+1);
        return res;
    }
    public static boolean nodetoroot(TreeNode root,TreeNode a)
    {
        if(root==null)
        {
            return false;
        }
        if(root.val==a.val)
        {
            a1.add(root);
            return true;
        }
            boolean v1=nodetoroot(root.left,a);
            if(v1)
            {
                a1.add(root);
                return true;
            }
       
            boolean v2=nodetoroot(root.right,a);
            if(v2)
            {
                a1.add(root);
                return true;
            }
        
        return false;
    }
}
