
class Solution {
    public TreeNode invertTree(TreeNode r) { //root =r 
         if (r == null)
             
      return null;

    TreeNode left = r.left ;  // l= left a= right 
    TreeNode right = r.right  ;
    r.left = invertTree(right );
    r.right  = invertTree(left);
    return r;
    }
}