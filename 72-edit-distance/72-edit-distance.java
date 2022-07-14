class Solution {
    public int minDistance(String w1, String w2) {
  
    final int a = w1.length();
    final int b = w2.length();

    
    int[][] dp = new int[a + 1][b + 1];

    for (int i = 1; i <= a; ++i)
      dp[i][0] = i;

    for (int j = 1; j <= b; ++j)
      dp[0][j] = j;

    for (int i = 1; i <= a; ++i)
        
      for (int j = 1; j <= b; ++j)
          
        if (w1.charAt(i - 1) == w2.charAt(j - 1))
          dp[i][j] = dp[i - 1][j - 1];
        
        else
          dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;

    return dp[a][b];
  }
}
    
