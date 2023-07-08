class Solution {
    public boolean buddyStrings(String A, String B) {

        if(A.length() != B.length()) return false;
        int[] a = new int[26];
        int[] b = new int[26];
        int num = 0;

        for(int i = 0; i < A.length(); i++) {
            char m = A.charAt(i);
            char n = B.charAt(i);

            a[m - 'a']++;
            b[n - 'a']++;
            if(m != n) num++;
        }
        if(num == 2) {
            for(int i = 0; i < 26; i++) {
                if(a[i] != b[i]) return false;
            }
            return true;
        }
        else if(num == 0) {
            for(int i =0 ; i < 26; i++) {
                if(a[i] >= 2) return true;
            }
            return false;
        }
        else return false;
    }
}