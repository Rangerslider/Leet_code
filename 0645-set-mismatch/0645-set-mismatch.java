// class Solution {
//     public int[] findErrorNums(int[] nums) {
//         int duplicate = 0;

//     for (final int num : nums) {
//       if (nums[Math.abs(num) - 1] < 0)
//         duplicate = Math.abs(num);
//       else
//         nums[Math.abs(num) - 1] *= -1;
//     }

//     for (int i = 0; i < nums.length; ++i)
//       if (nums[i] > 0)
//         return new int[] {duplicate, i + 1};

//     throw new IllegalArgumentException();
//     }
// }

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[]  arr = new int[nums.length];
        int[] result= new int[2];
        
        for(int i:nums){
            arr[i-1]++;
        }
         for( int i=0;i<arr.length; i++){
             if (arr[i]==2){
                 result[0]=i+1;
             }
             if(arr[i]==0){
                 result[1]=i+1;
             }
    
         }
        return result;
  }
}

