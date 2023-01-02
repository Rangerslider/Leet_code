class Solution {
    public boolean detectCapitalUse(String word) {
        int a = 0, b = word.length();
        if (word.length () == 0 ) {
            return true;
        }
        for(int i = 0 ; i < b; i++){
        int ch = word.charAt(i);
            if(ch>= 65 && ch<91)
            a++;
        }
        if (a== b){
         return true;
        }
        
        if (a== 0) {
            return true; 
        }
        
    if(a==1 && word.charAt(0)>= 65 && word.charAt(0)<91) {
        return true;
    }
    return false ;
    }
}