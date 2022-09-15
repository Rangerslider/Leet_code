class Solution {
    public int[] sortedSquares(int[] nums) {
         final int n = nums.length;
        int[] res = new int [n];
        int i = n-1 ;
        
        for (int l = 0, r = n - 1; l <= r;)
            
      if (Math.abs(nums[l]) > Math.abs(nums[r]))
          
        res[i--] = nums[l] * nums[l++];
      else
        res[i--] = nums[r] * nums[r--];

    return res;
  
        }
    }
