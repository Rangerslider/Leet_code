
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) 
    {

    List<List<Integer>> ans = new ArrayList<>();
    TreeMap<Integer, List<int[]>> p = new TreeMap<>(); // {x: {(-y, val)}}

    dfs(root, 0, 0, p);

    for (List<int[]> pairs :p.values()) 
    {
      Collections.sort(pairs, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
      List<Integer> vals = new ArrayList<>();
        
      for (int[] pair : pairs)
        vals.add(pair[1]);
      ans.add(vals);
    }

    return ans;
  }

  private void dfs(TreeNode root, int x, int y, TreeMap<Integer, List<int[]>> p)
  {
    if (root == null)
      return;

    p.putIfAbsent(x, new ArrayList<>());
    p.get(x).add(new int[] {y, root.val});
    dfs(root.left, x - 1, y + 1, p);
    dfs(root.right, x + 1, y + 1, p);
  }
}
  
   