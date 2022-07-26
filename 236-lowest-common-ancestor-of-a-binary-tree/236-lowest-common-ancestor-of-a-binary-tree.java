
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode r, TreeNode p, TreeNode q) {
         if (r == null) {
            return null;
        }
        
        TreeNode left = lowestCommonAncestor(r.left, p, q);
        TreeNode right = lowestCommonAncestor(r.right, p, q);
        
        if (left != null && right != null) {
            return r;
        }
        
        if (r == p || r == q) {
            return r;
        }
        
        return left != null ? left : right;
    }
}