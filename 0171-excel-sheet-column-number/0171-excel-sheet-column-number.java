class Solution {
    public int titleToNumber(String s) {  // s= coloum title 
       
    int ans = 0;

    for (final char c : s.toCharArray())
      ans = ans * 26 + c - '@';

    return ans;
  }
}
    