class Solution {
    public TreeNode pruneTree(TreeNode root) 
    {
       if (root == null)
       {
            return root;
        }

        boolean r = helper(root);
        if (r) 
        {
            return null;
        }
        
        return root;
    }



    private boolean helper(TreeNode root) {
        if (root == null)
        {
            return true;
        }
        
        boolean left = helper(root.left);
        boolean right = helper(root.right);


        if (left) 
        {
            root.left = null;
        }

        if (right)
        {
            root.right = null;
        }

        if (left && right && root.val == 0) 
        {
            return true;
        }

        return false; 
    }
}