class Solution {
    public int longestConsecutive(int[] nums) {
    int a = 0;
    Set<Integer> s = new HashSet<>();

    for (final int num : nums)
      s.add(num);

    for (int num : nums) {
      if (s.contains(num - 1))
        continue;
      int length = 1;
      while (s.contains(++num))
        ++length;
      a = Math.max(a, length);
    }

    return a;
  }
}
    