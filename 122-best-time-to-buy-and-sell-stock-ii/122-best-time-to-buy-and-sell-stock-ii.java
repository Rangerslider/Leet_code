class Solution {
    public int maxProfit(int[] prices) 
    {
            int a = 0;
            int b = Integer.MIN_VALUE;

    for (final int price : prices)
    {
      a = Math.max(a, b + price);
      b = Math.max(b, a - price);
    }

    return a;
   
    }
}