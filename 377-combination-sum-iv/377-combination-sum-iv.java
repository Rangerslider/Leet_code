class Solution {
    public int combinationSum4(int[] nums, int target) {
    int[] c= new int[target + 1];
    c[0] = 1;
    for (int i = 1; i < c.length; i++) {
        for (int j = 0; j < nums.length; j++) {
            if (i - nums[j] >= 0) {
                c[i] += c[i - nums[j]];
            }
        }
    }
    return c[target]; 
    }
}