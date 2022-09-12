class Solution {
    public boolean isScramble(String s1, String s2) {
           if (s1 == null || s2 == null || s1.length() != s2.length()) {
	            return false;
	        }

	        int len = s1.length();

	        boolean[][][] dp = new boolean[len][len][len + 1];

	        for (int i = 0; i < len; i++) {
	            for (int j = 0; j < len; j++) {
	                dp[i][j][1] = s1.charAt(i) == s2.charAt(j);
	            }
	        }

	        for (int n = 1; n < len + 1; n++) {
	            for (int i = 0; i + n - 1 < len; i++) { 
	                for (int j = 0; j + n - 1 < len; j++) {

	                    for (int sublen = 1; sublen < n; sublen++) {

	                        boolean ifSame = dp[i][j][sublen] && dp[i + sublen][j + sublen][n - sublen];

	                        boolean ifSwapped = dp[i][j + n - sublen][sublen] && dp[i + sublen][j][n - sublen];

	                       
	                        if (ifSame || ifSwapped) {
	                            dp[i][j][n] = true;
	                            break;
	                        }
	                    }
	                }
	            }
	        }

	        return dp[0][0][len];

	    }
	}

    
