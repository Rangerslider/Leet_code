class Solution {
    public int removeDuplicates(int[] nums) {
         int a = 0;
    for (final int num : nums)
      if (a < 2 || num > nums[a - 2])
        nums[a++] = num;
    return a;
    }
}