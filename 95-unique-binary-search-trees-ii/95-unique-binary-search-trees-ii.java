
class Solution {
    public List<TreeNode> generateTrees(int n) {
       if (n <= 0) {
            ArrayList<TreeNode> r = new ArrayList<TreeNode>();
            r.add(null);
            return r;
        }
       
        int[] a = new int[n];
        for (int i=0; i< n; i++) a[i] = i+1;
        
        return generateTreesHelper(a, 0, n-1);
    }

    public ArrayList<TreeNode> generateTreesHelper(int[] a, int i, int j) {
        
        ArrayList<TreeNode> r = new ArrayList<TreeNode>();
        if (i>j) return r;
        for (int k = i; k <= j; k++) {
            ArrayList<TreeNode> left = generateTreesHelper(a, i, k-1);
            ArrayList<TreeNode> right = generateTreesHelper(a, k+1, j);
            for (int m = 0; m < Math.max(left.size(),1); m ++) {
                for (int n = 0; n < Math.max(right.size(), 1); n++) {
                    TreeNode node = new TreeNode(a[k]);
                    if (left.size() > 0) {
                        node.left = left.get(m);
                    }
                   
                    if (right.size() > 0) {
                        node.right = right.get(n);
                    }
                    r.add(node);
                }
            }
        }
        return r; 
    }
}