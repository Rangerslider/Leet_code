class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         int[] alphabet = new int[26];
       
        for (int i = 0; i < magazine.length(); i++){  
            alphabet[magazine.charAt(i) - 97]++;
        }
   
        for (int i = 0; i < ransomNote.length(); i++){
            if (--alphabet[ransomNote.charAt(i) - 97] < 0){   
             return false;
            }

        }
        return true;
    }
}