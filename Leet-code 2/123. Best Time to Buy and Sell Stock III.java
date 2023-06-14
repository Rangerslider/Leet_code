class Solution {
    public int maxProfit(int[] price) {

        if(price == null || price.length <= 1) return 0;

        int len = price.length;
        int[][] buy = new int[len + 1][3];
        int[][] sell = new int[len + 1][3];

        buy[1][1] = -price[0];
        buy[1][2] = Integer.MIN_VALUE;

        for(int i = 2; i <= len; i++)
        {
            for(int j = 1; j <= 2; j++)
            {
                buy[i][j] = Math.max(buy[i - 1][j], sell[i - 1][j - 1] - price[i - 1]);
                sell[i][j] = Math.max(sell[i - 1][j], buy[i - 1][j] + price[i - 1]);
            }
        }       
        return Math.max(sell[len][0], Math.max(sell[len][1], sell[len][2]));
    }
}