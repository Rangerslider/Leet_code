class Solution {
    public int mySqrt(int n) {
             long ans = 1;
     
        while (ans * ans <= n) {
            ++ans;
        }
        
        return (int) ans - 1;
    }
}
    
