class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
      int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);
        prices[src] = 0;
        for (int i = 0; i <= k; i++) {
            int[] temp = Arrays.copyOf(prices, n);
            for (int[] flight : flights) {
                int cur = flight[0], next = flight[1], price = flight[2];
                if (prices[cur] == Integer.MAX_VALUE) continue;
                temp[next] = Math.min(temp[next], prices[cur] + price);
            }
            prices = temp;
        }
        return prices[dst] == Integer.MAX_VALUE ? -1 : prices[dst];  
    }
}