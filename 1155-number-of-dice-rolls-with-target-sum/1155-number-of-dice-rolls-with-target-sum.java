class Solution {
       
    private final int MODULO = 1000000007;
    private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    private Integer[][] cache;
    
    private int n = 0;
    private int k = 0;
    public int numRollsToTarget(int n, int k, int target) {
      
    this.n = n;
        this.k = k;
        this.cache = new Integer[n+1][target+1];
        return dp(0, target);
        
        
    }
    
    public int dp(int i, int remain){
        // escape condition
        if(i == n && remain == 0){
            return 1;  
        } 
        
        if(i > n || remain < 0){
            return 0;  
        } 
        
        if(cache[i][remain] != null){
            return cache[i][remain];
        } 
        
        int ans = 0;
        for(int num = 1; num <= k; num++) {
            ans += dp(i + 1, remain - num);
            ans %= MODULO;
        }
        
        return cache[i][remain] = ans;
    }
}