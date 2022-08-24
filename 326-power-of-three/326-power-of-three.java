class Solution {
    public boolean isPowerOfThree(int n) {
        
    int a=0;
    boolean r=false;

    if(n!=0){
        
    while(a==0){
        
        if(n==1)
        {
            r=true;
            break;
        }
        a=n%3;
        n=n/3;
    }
    }
    return r;
    }
}