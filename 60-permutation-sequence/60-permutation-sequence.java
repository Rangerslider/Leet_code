class Solution {
    public String getPermutation(int n, int m) {
        
        ArrayList<Integer> arr =new ArrayList<>();
        
        int f = 1;  //f= fact 
        
        
        for (int  i=1; i<n; i++){
            f= f*i;
            arr.add(i);  
        }
        
        arr.add(n);
        m = m-1;
        String a ="";
        
        while (true ){
            int i1 = m / f;
            int i2 = m % f;
            
            a+= arr.get(i1);
            arr.remove (i1);
            
            m= i2;
            
            if (arr.size ( ) ==0){
                break;
                
            }
            f = f/arr.size();
        }
        return a;
    }
}
   