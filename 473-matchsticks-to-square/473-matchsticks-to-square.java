class Solution {
    public boolean makesquare(int[]nums) {
      Long s = 0l;
        
        for(int x:nums){
            s =s + x;
        }
        
       if(s%4!=0||nums.length<4)
            return false;
        long width = (s/4);
        Arrays.sort(nums);
        
        long s1=0,
             s2=0, 
             s3=0,
             s4=0;
        return 
            helper(nums, nums.length-1, s1, s2, s3, s4, width);
        
    }
    
    public boolean helper(int[] a, int i, long s1, long s2, long s3, long s4, long width){
        
        if(s1>width || s2>width || s3>width || s4>width)
            return false; 
        
        if(i==-1){
            if(s1==width  && s2==width  && s3==width && s4==width) 
                return true;
            
            else
                return false;
        }
        
        return
        helper(a,i-1,  s1+a[i], s2, s3, s4,   width)||
        helper(a,i-1,  s1, s2+a[i], s3, s4,   width)||
        helper(a,i-1,  s1, s2, s3+a[i], s4,   width)||
        helper(a,i-1,  s1, s2, s3, s4+a[i],   width);  
    }
}