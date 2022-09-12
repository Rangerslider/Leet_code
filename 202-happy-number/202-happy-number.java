class Solution {
  public boolean isHappy(int n) {
    int s= squaredSum(n);
    int f= squaredSum(squaredSum(n));

    while (s != f) {
     s = squaredSum(s);
      f = squaredSum(squaredSum(f));
    }

    return s == 1;
  }

  private int squaredSum(int n) {
    int sum = 0;
    while (n > 0) {
      sum += Math.pow(n % 10, 2);
      n /= 10;
    }
    return sum;
  }
}