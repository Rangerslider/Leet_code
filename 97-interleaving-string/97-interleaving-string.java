class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        final int n = s1.length();
        final int j = s2.length();
        if(n+j != s3.length())
            return false ;
        
        boolean[] dp = new boolean [j+1];
        
        for (int a= 0; a<=n; ++a)
            for(int b = 0; b<=j; ++b)
                
                if (a==0 && b==0)
                    dp[b] = true;
        
        else if (a == 0)
          dp[b] = dp[b - 1] && s2.charAt(b - 1) == s3.charAt(b - 1);
        
        else if (b == 0)
          dp[b] = dp[b] && s1.charAt(a- 1) == s3.charAt(a - 1);
        
        
        else
          dp[b] = dp[b] && s1.charAt(a - 1) == s3.charAt(a + b - 1) ||
                  dp[b - 1] && s2.charAt(b - 1) == s3.charAt(a + b - 1);

    return dp[j];
    }
}
