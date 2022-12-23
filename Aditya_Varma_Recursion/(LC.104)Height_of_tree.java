// 104. Maximum Depth of Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return solve(root);
    }
    public static int solve(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftSide=solve(root.left);
        int rightSide=solve(root.right);
        return 1+Math.max(leftSide,rightSide);
    }
}
