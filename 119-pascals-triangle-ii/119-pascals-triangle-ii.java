class Solution {
    public List<Integer> getRow(int a) {
        
    Integer[] ans = new Integer[a + 1];
    Arrays.fill(ans, 1);

    for (int i = 2; i <a + 1; ++i)
      for (int j = 1; j < i; ++j)
        ans[i - j] += ans[i - j - 1];

    return Arrays.asList(ans);
  }
} 
    
