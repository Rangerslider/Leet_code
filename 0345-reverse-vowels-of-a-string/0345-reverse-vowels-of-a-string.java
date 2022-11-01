class Solution {
    public String reverseVowels(String s) {
        
        char[] A= s.toCharArray();
        
        int i = 0;
        int j = A.length - 1;
        
        while (i < j) 
        {
            if (isVowel(A[i]) && isVowel(A[j])) 
            {
                char b = A[i];
        
                A[i++] = A[j];
                A[j--] = b;
                
            } 
            else if (isVowel(A[i]))
            {
                j--;
            } 
            else 
            {
                i++;
            }
        }

        return String.valueOf(A);
    }

    private boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}