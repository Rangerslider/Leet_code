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
    
    public void allPaths(TreeNode root, String a, List<String> paths)
    {
        if(root.left == null && root.right == null)
        {
            paths.add(a+root.val);
            return;
        }
        
        if(root.left != null)
        {
            allPaths(root.left,a+root.val+"->",paths);
        }
        
        if(root.right != null)
        {
            allPaths(root.right,a+root.val+"->",paths);
        }
    }
    
    public List<String> binaryTreePaths(TreeNode root)
    {
        List<String> ans = new ArrayList<>();
        if(root == null)
            return ans;
        allPaths(root,"",ans);
        return ans;
    }
    
}