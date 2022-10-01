class Solution {
    public int numDecodings(String s)
    {
        int n = s.length();
    // check 0
    if (s.charAt(0) == '0') return 0;
    if (n == 1) return 1;
    
    int[] num = new int[n];
        
    num[n - 1] = (s.charAt(n - 1) == '0') ? 0 : 1;
    num[n - 2] = (s.charAt(n - 2) == '0') ? 0 :
        (num[n - 1] + (s.substring(n - 2, n).compareTo("26") <= 0 ? 1 : 0));
        
    for (int i = n - 3; i >= 0; i--) 
    {
        if (s.charAt(i) == '0') continue;
        
        num[i] = (s.substring(i, i + 2).compareTo("26") <= 0) ? 
            num[i + 1] + num[i + 2] : num[i + 1];
    }
        
    return num[0];
        
    }
}