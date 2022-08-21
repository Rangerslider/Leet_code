class Solution {
  public TreeNode buildTree(int[] a, int[] b) {
      
    Map<Integer, Integer> x = new HashMap<>(); 

    for (int i = 0; i <a.length; ++i)
      x.put(a[i], i);

    return build(a, 0, a.length - 1, b, 0, b.length - 1, x);
  }

  TreeNode build(int[] a,
                 int j, int n, 
                 int[] b, 
                 int p, int q,  
                 Map<Integer, Integer> x) 
  {
    if (j > n)
      return null;

    final int m = b[q];                                             //m=rootvalue 
    final int v = x.get(m);                                         //v=rootindex entry
    final int left = v- j;

    TreeNode root = new TreeNode(m);
      
    root.left = build(a, j,v - 1, b, p,  p + left - 1, x);
    root.right = build(a, v + 1,n, b, p + left,  q- 1, x);
      
    return root;
  }
} 
//  j= in start root ,n= in end 
//p=poststart,q=postend  
