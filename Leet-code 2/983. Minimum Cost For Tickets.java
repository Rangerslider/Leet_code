class Solution {
    int[] dp = new int[366];
    public int mincostTickets(int[] days, int[] costs) {
        

        Set<Integer> set = new HashSet<>();
        for (int day : days) set.add(day);
        for (int i = 1; i < dp.length; i++) {
            if (set.contains(i)) {
                int one = costs[0] + getCostOfDay(i-1);
                int seven = costs[1] + getCostOfDay(i-7);
                int thirty = costs[2] + getCostOfDay(i-30);
                dp[i] = Math.min(one, Math.min(seven, thirty));
            } else {
                dp[i] = dp[i-1];
            }
        }
        
        return dp[365];
    }
    
    private int getCostOfDay(int day) {
        if (day <= 0) return 0;
        return dp[day];
    }
}