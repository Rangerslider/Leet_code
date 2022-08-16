class Solution {
    public int firstUniqChar(String s) {
        
        int len = s.length();
        
        if(len == 0){
            return -1;
        }
        
        int[] arr = new int[26];
        
        for(char c : s.toCharArray()){
            arr[c - 'a']++;
        }
        
        for(int i=0; i<len; i++){
            if(arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        
        return -1;
    }
}