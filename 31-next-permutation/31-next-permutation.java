class Solution {
    public void nextPermutation(int[] nums) { 
    if (nums == null || nums.length == 0) return;

            int maxElementIndex = nums.length-1;
            for (int i=nums.length-2;i>=0;i--) {
                if (nums[maxElementIndex]< nums[i]) maxElementIndex = i;
                if(nums[i] < nums[i+1]) {
                    for (int j=nums.length-1;j>i;j--) {
                        if (nums[j] > nums[i]){
                            maxElementIndex = j;
                            break;
                        }
                    }
                    swap(nums, i, maxElementIndex);
                    Arrays.sort(nums, i+1, nums.length);
                    return;
                }
            }

            Arrays.sort(nums);
        }

        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}