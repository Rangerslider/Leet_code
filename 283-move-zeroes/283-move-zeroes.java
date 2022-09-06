class Solution {
    public void moveZeroes(int[] nums) 
    {
        int j = 0;
        
        for (int i = 0; i < nums.length; i ++) 
        {
            if (nums[i] != 0) 
            {
                if (i != j) 
                {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
                
                j ++;
            }
        }
    }
}
    


/*curr=0 to n-1
    maxfor non zeero =2
     cur= 1,2,3,4 --------- n-1
    
    [0,1,0,3,12]
    [1,0,0,3,12]
    [1,3,0,0,12]
    [1,3,12,0,0] */