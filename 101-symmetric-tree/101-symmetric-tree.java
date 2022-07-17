
class Solution {
    public boolean isSymmetric(TreeNode r) {
         return isSymmetric(r, r);
  }
  private boolean isSymmetric(TreeNode m, TreeNode n) {
    if (m == null || n == null)
      return m == n;
    return m.val == n.val && isSymmetric(m.left, n.right) && isSymmetric(m.right, n.left);
  }
}
    