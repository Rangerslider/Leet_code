class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int t) {
        
      int r = matrix.length, 
       c = matrix[0].length;
                                                             
        int[][] s = new int[r + 1][c + 1];
                                                             
        for (int i = 1; i <= r; i++) {
            
            for (int j = 1; j <= c; j++) {
                
                s[i][j] = s[i - 1][j] +s[i][j - 1] - s[i - 1][j - 1] + matrix[i - 1][j - 1];
                
            }
        }

        int count = 0;
        
        for (int top = 0; top < r; top++) {
            
            for (int down = top + 1; down <= r; down++) {
                
                Map<Integer, Integer> map = new HashMap<>();
              
                map.put(0, 1);
                
                for (int k = 1; k <= c; k++) {
                    int sum = s[down][k] - s[top][k];
                    
                    count += map.getOrDefault(sum - t, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }
        return count;  
    }
}