public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    
        int a = 0;
 
    // traverse the binary represent  of n - O(32) 
    for (int i = 0; i < 32; i++) 
    {
 
        // increment counter jodi dorker hoi 
        if ((n & 1) == 1) a++;
 
        // shift n right 
        n >>= 1;
    }
 
    //count of 1s
    return a;
    }
}