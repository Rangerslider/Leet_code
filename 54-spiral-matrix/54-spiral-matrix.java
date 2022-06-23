class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
      return new ArrayList<>();
        
        final int m = matrix.length;
        final int n = matrix[0].length;
        
   List<Integer> ans = new ArrayList<>();
        
        int a1= 0; 
        int b1= 0; 
        int a2= m - 1;
        int b2= n-1;
        
        while ( ans.size() <m*n ){
            for (int i= b1; i<= b2 && ans.size() <m*n; ++i )
                ans.add (matrix [a1][i]);
            
             for (int j= a1 +1; j<= a2 - 1 && ans.size() <m*n; ++j )
                ans.add (matrix [j][b2]);
            
             for (int i= b2; i>= b1 && ans.size() <m*n; --i )
                ans.add (matrix [a2][i]);
            
             for (int j= a2 -1; j>= a1+1 && ans.size() <m*n; --j )
                ans.add (matrix [j][b1]);
            
             ++a1;
             ++b1;
             --a2;
             --b2;
            
        }
        return ans;
    }
}
    
  