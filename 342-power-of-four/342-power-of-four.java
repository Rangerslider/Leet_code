class Solution {
    
    public boolean isPowerOfTwo(int n){
        return ( (n > 0) && ( ( n & (n-1)) == 0 )  );
    }
    public boolean isPowerOfFour(int n) {
        return (isPowerOfTwo(n) && (n & 0x55555555)!=0);
    }
}