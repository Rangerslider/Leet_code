class Solution {
    public int wiggleMaxLength (int[] nums) {
        if(nums == null || nums.length==0)
        return 0;
    if(nums.length<2){
        return nums.length;
    }    
 
    int count=1;
 
 
    for(int a=1, b=0; a<nums.length; b=a, a++){
        if(nums[b]<nums[a]){
            count++;
            while(a<nums.length-1 && nums[a]<=nums[a+1]){
                a++;
            }
        }else if(nums[b]>nums[a]){
            count++;
            while(a<nums.length-1 && nums[a]>=nums[a+1]){
                a++;
            }
        }
    }
 
    return count;
    }
}