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
  public String tree2str(TreeNode t) 
  {
     
       if (t == null)
            return "";
      
        if (t.left == null && t.right == null)
            return String.valueOf(t.val);
      
      
        StringBuffer a = new StringBuffer();
      
        Stack<TreeNode> stack = new Stack<TreeNode>();
      
        Set<TreeNode> visited = new HashSet<TreeNode>();
      
        stack.push(t);
      
        while (!stack.isEmpty()) 
        {
            TreeNode node = stack.peek();
            if (visited.contains(node))
            {
                stack.pop();
                a.append(")");
            } 
            else 
            {
                visited.add(node);
                a.append("(");
               a.append(node.val);
                TreeNode left = node.left, right = node.right;
                
                if (left == null && right != null)
                    a.append("()");
                
                if (right != null)
                    stack.push(right);
                
                if (left != null)
                    stack.push(left);
            }
        }
      
        String treeStr = a.toString().substring(1, a.length() - 1);
        return treeStr;
  }
}
