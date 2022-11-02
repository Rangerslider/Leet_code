class Solution {
    public int minMutation(String start, String end, String[] bank) {
        
               
        if (start == null || start.length() < 8 || end == null || end.length() < 8)
        {
            throw new IllegalArgumentException ("input is not valid");
        }

        char[] A = new char[]{'A', 'C', 'G', 'T'};
        
        Set<String> genes = new HashSet<>(Arrays.asList(bank));

       
        Map<String, Integer> B = new HashMap<>();
        
        B.put(start, 0);
        
        Queue<String> queue = new LinkedList<>();
        queue.add(start);

        
        while (queue.size() > 0)
        {
            String cur = queue.remove();
            int C = B.get(cur);

            
            if (cur.equals(end)) 
            {
                return C;
            }

            char[] chars = cur.toCharArray();
            
            for (int i = 0; i < 8; i ++)
            {
                char originalChar = chars[i];

                for (int j = 0; j < A.length; j ++) 
                {
                    if (A[j] == originalChar) 
                    {
                        continue;
                    }
                    
                    
                    chars[i] = A[j];
                    String newStr = String.valueOf(chars);
                    
                    if (!genes.contains(newStr) ||B.containsKey(newStr))
                    {
                        continue;
                    }

                    B.put(newStr, C + 1);
                    queue.add(newStr);
                    
                }

                chars[i] = originalChar;
                
                
            }
        }

        return -1;
    }
    
    
}
    