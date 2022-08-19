class Solution {
  public List<List<Integer>> subsetsWithDup(int[] n) {
      
    List<List<Integer>> a = new ArrayList<>();

    Arrays.sort(n);
    dfs(n, 0, new ArrayList<>(), a);

    return a;
  }

  private void dfs(int[] n, int s, List<Integer> path, List<List<Integer>> a) {
      
    a.add(new ArrayList<>(path));

    for (int i = s; i < n.length; ++i) {
        
      if (i > s && n[i] == n[i - 1])
        continue;
        
      path.add(n[i]);
      dfs(n, i + 1, path, a);
      path.remove(path.size() - 1);
    }
  }
}