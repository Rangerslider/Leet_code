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
    public int minDiffInBST(TreeNode root) {
       int res = Integer.MAX_VALUE;

        TreeNode curNode = root, preNode = null;
        Stack<TreeNode> stack = new Stack<>();

        while (curNode != null || !stack.isEmpty()) {
            if (curNode != null) {
                stack.push(curNode);
                curNode = curNode.left;
            }
            else {
                curNode = stack.pop();
                if (preNode != null) {
                    res = Math.min(res, Math.abs(preNode.val - curNode.val));
                }
                preNode = curNode;
                curNode = curNode.right;
            }

        }
        return res; 
    }
}