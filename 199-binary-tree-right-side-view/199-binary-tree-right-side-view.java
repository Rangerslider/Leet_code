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
    public List<Integer> rightSideView(TreeNode r) {
       
    List<Integer> a = new ArrayList <>();
        dfs (r,0, a);//r = root ,a= ans 
        return a;
        
    }
    private void dfs (TreeNode r,int depth, List<Integer> a){
        if (r== null)
            return;
        if(depth == a.size ())
            a.add(r.val);
        dfs(r.right,depth + 1, a);
        dfs(r.left,depth + 1,  a);
    }
}
