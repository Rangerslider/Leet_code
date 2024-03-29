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
    public int maxPathSum(TreeNode root) {
       maxPathSumDownFrom (root);
    return a ;
        
  }

  private int a = Integer.MIN_VALUE;

  // root->val + 0/1 of its subtrees
    
  private int maxPathSumDownFrom(TreeNode root)
  {
    if (root == null)
      return 0;

    final int l = Math.max(maxPathSumDownFrom(root.left), 0);
    final int r = Math.max(maxPathSumDownFrom(root.right), 0);
      
    a = Math.max(a, root.val + l + r);
      
    return root.val + Math.max(l, r);
  } 
    }
