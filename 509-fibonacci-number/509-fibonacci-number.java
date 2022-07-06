class Solution {
    public int fib(int n) {
        if (n==0) return 0;
        if (n==1)  return 1;
        
        int i = 0;
        int j = 1;
        int sum = i+ j;
        
        while (n>1){
            sum = i + j;
            i=j;
            j= sum;
            
            n--;
        }
        return sum;
        
        
        
    }
}