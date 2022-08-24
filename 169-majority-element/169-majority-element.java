class Solution {
    public int majorityElement(int[] nums) {
        
       Integer a = null;
    int count = 0;
    for (final int num : nums) {
      if (count == 0)
        a = num;
      count += num == a ? 1 : -1;
    }
    return a;  
    }
}