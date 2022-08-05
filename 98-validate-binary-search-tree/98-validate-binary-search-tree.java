
class Solution {
    public boolean isValidBST(TreeNode root) {
  return isValidBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);    
}
 
public boolean isValidBST(TreeNode a, double min, double max){
    if(a==null) 
        return true;
 
    if(a.val <= min || a.val >= max)
        return false;
 
    return isValidBST(a.left, min, a.val) && isValidBST(a.right, a.val, max);
    }
}