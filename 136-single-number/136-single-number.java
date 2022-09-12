class Solution {
    public int singleNumber(int[] n) {
        
        int ans = 0;
    for (final int num : n)
      ans ^= num;
    return ans;
    }
}