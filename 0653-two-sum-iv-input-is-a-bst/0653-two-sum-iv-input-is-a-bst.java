
class Solution {
    public boolean findTarget(TreeNode root, int k)
    {
        HashSet<Integer> n = new HashSet<Integer>();
        return inorder(root, k, n);
    }
    
    private boolean inorder(TreeNode node, int k, HashSet<Integer> n)
        
    {
        if (node == null) 
        {
            return false;
        }
        
        if (inorder(node.left, k, n)) 
        {
            return true;
        }
        
        if (n.contains(k - node.val)) 
        {
            return true;
        }
        
        n.add(node.val);
        
        if (inorder(node.right, k, n)) 
        {
            return true;
        }
        
        return false; 
    }
}