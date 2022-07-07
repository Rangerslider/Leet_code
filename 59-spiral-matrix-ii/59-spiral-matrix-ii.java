class Solution {
    public int[][] generateMatrix(int n) {
        int[][] r = new int[n][n];
 
    int a   = 1; 
    int top = 0;
    int down = n-1;
    int left = 0;
    int right = n-1;
 
    while(a <= n*n){
        
        for(int i=left; i<=right; i++){
            r[top][i]= a;
            a++;
        } 
        
        top++;
 
        for(int i=top; i<= down; i++){
            r[i][right]=a;
            a++;
        }
        right--;
 
        for(int i=right; i>=left; i--){
            r[down][i]=a;
            a++;
        }
        down--;
 
        for(int i=down; i>=top; i--){
            r[i][left] = a;
            a++;
        }
        left++;
    }
 
    return r;
    }
}