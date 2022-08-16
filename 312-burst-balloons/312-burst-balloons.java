class Solution {
    public int maxCoins(int[] n) {
        final int a = n.length;
        
    int[] A = new int[a + 2];
    System.arraycopy(n, 0, A, 1, a);
    A[0] = 1;
    A[a + 1] = 1;

   
    int[][] dp = new int[a + 2][a + 2];

    for (int d = 0; d < a; ++d)
        
      for (int i = 1; i + d <= a; ++i) {
          
        final int j = i + d;
          
        for (int k = i; k <= j; ++k)
          dp[i][j] = Math.max(dp[i][j],
                              dp[i][k - 1] +
                              dp[k + 1][j] +
                              A[i - 1] * A[k] * A[j + 1]);
      }

    return dp[1][a];
    }
}