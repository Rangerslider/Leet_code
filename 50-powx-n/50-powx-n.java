class Solution {
    public double myPow(double x, int n) {
    double[] stored = new double[32];
    stored[0] = x;
    for (int i = 1; i < 32; i++) stored[i] = stored[i-1] * stored[i-1];
    
    int exponent = n < 0 ? n == Integer.MIN_VALUE ? Integer.MIN_VALUE : -n : n;
    double ans = 1;
    for (int i = 0; i < 32; i++) {
        if ((exponent&(1<<i)) != 0) {
            ans *= stored[i];
        }
    }

    return n > 0 ? ans : 1/ans;
}
}
