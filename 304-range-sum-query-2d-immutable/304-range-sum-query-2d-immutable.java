class NumMatrix {
    long[][] prefixSum;

  
    public NumMatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        prefixSum = new long[n+1][m+1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                prefixSum[i][j] = mat[i-1][j-1] + prefixSum[i-1][j] + prefixSum[i][j-1] - prefixSum[i-1][j-1];
    }
    
    
    public int sumRegion(int R1, int C1, int R2, int C2) {
         R1+=1;C1+=1;R2+=1;C2+=1;
        return (int)(prefixSum[R2][C2] - prefixSum[R2][C1-1] - prefixSum[R1-1][C2] + prefixSum[R1-1][C1-1]);
    
    }
}
