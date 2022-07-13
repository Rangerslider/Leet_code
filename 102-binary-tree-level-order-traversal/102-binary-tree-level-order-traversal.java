
class Solution {
    public List<List<Integer>> levelOrder(TreeNode r) {

  if (r == null)
      
      return new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    Queue<TreeNode> a = new LinkedList<>(Arrays.asList(r));
        
    while (!a.isEmpty()) {
        
      List<Integer> currLevel = new ArrayList<>();
      for (int size = a.size(); size > 0; --size) {
        TreeNode node = a.poll();
        currLevel.add(node.val);
        if (node.left != null)
          a.offer(node.left);
        if (node.right != null)
          a.offer(node.right);
      }
      ans.add(currLevel);
    }
    return ans;
  }
}