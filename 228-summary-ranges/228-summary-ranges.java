class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> result = new ArrayList<>();
            int left = 0, n = nums.length;
        
            while (left < n) 
            {
                int right = 1;
                
                while (left + right < n && (long)nums[left + right] - nums[left] == right)
                {
                    ++right;
                }
                
                result.add(
                    right <= 1 ?
                        String.valueOf(nums[left])
                        : String.valueOf(nums[left]) + "->" + String.valueOf(nums[left + right - 1]));
                left += right;
                
            }

            return result;

        }
    }
