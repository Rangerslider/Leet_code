class Solution {
    public int longestPalindrome(String[] words) {
      

        Map<String, Integer> A = new HashMap<>();
        
        
        int ans = 0, p = 0, n = words.length;
        
        
        for (int i = 0; i < n ; i++)
        {
            String s = words[i];
            char a = s.charAt(0);
            char b = s.charAt(1);
            
            
            if (A.containsKey(s))
            {
            
               ans += 4;
               A.put(s, A.get(s) - 1);
                
                if (A.get(s) == 0) 
                {
                    A.remove(s);
                }
                
                if (a == b) 
                {
                    p--;
                }
                
            } 
            else if (a == b)
            {
               
                A.put(s, 1);
                p++;
                
            } 
            else
            {
               
                String toAdd = "" + b + a;
                
                if (!A.containsKey(toAdd))
                {
                    A.put(toAdd, 1);
                }
                else
                {
                    A.put(toAdd, A.get(toAdd) + 1);
                }
            }
        }
        
        if (p > 0)
        
        {
            ans += 2;
        }
        
        return ans;
    }
} 

   

        
   