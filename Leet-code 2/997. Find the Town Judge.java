class Solution {
    public int findJudge(int n, int[][] trust) {
    int[] Score = new int[n + 1];
    for (int[] Pair : trust) {
      Score[Pair[1]]++;
      Score[Pair[0]]--;
    }
    for (int i = 1; i <= n; i++) {
      if (Score[i] == n - 1) {
        return i;
      }
    }
    return -1; 
    }
}