class Solution {
    public int tribonacci(int n) {
              if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        
        int num0 = 0,num1 = 1,num2=1;
        int sum = 0;
        for(int i = 3; i<=n;i++){
            sum = num0 + num1 + num2;
            num0 = num1;
            num1 = num2;
            num2 = sum;
        }
        
        return sum;  
    }
}