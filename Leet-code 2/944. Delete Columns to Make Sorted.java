class Solution {
    public int minDeletionSize(String[] s) {
        int a= s[0].length();
        int ans = 0;

        for(int i = 0; i<a ; i++){ //i =colume,j= row 
            for(int j = 1; j<s.length; j++){
                if(s[j].charAt(i)< s[j-1].charAt(i)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
        
    }
}