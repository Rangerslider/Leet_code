class Solution {
    public boolean isMonotonic(int[]A) {
        int d = 0;
        if(A == null || A.length == 0){
            return true;
        }
        for(int i = 1; i<A.length; i++){
            if(A[i] > A[i-1]){
                if(d < 0){
                    return false;
                }
                d = 1;
            }
            else if(A[i] < A[i-1]){
                if(d > 0){
                    return false;
                }

                d = -1;
            }
        }

        return true;
    }
}  
