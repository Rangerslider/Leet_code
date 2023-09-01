class Solution {
    public boolean repeatedSubstringPattern(String s) {
       int n = s.length();
       int[] num = new int[n];
       int i = 1, j = 0;
        while (i < n) {
            if (s.charAt(i) == s.charAt(j)) num[i++] = ++j;
            else if (j == 0) num[i++] = 0;
            else j = num[j - 1];
        }

        return num[n - 1] != 0 && n % (n - num[n - 1]) == 0; 
    }
}