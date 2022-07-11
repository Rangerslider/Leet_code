class Solution {
    public boolean isNumber(String s) {
        int n = s.length();
        boolean decimal = true, 
        Exp = true, 
        digit= false;
        
        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
          
            if( Character.isDigit(c) ) 
                digit = true;
       
            else if( c == '+' || c == '-' ) {
                char prevC = i == 0 ? '\0' : s.charAt(i-1);
                if( (prevC != '\0' && prevC != 'e' && prevC != 'E') || i == n-1  )
                    return false;
            }
            
            
            else if( c == 'e' || c == 'E' ) {
                if( !digit || i == n-1 || !Exp )
                    return false;
                Exp = false;
            }
            
         
            else if( c == '.' ) {
                if( !decimal || !Exp )
                    return false;
              decimal = false;
            }
            
           
            else return false;
        }
        
       
        return digit;
    }
}