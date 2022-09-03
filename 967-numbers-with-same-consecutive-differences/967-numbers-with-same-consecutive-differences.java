class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        
       if (n == 1) 
       {
            int[] nums = new int[10];
           
            for (int i = 0; i < 10; i++)
                nums[i] = i;
           
            return nums;
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for (int i = 1; i <= 9; i++) 
        {
            int nextDigit1 = i - k, nextDigit2 = i + k;
            
            if (nextDigit1 >= 0)
                queue.offer(i * 10 + nextDigit1);
            
            if (k != 0 && nextDigit2 < 10)
                queue.offer(i * 10 + nextDigit2);
        }
        
        for (int digits = 3; digits <= n; digits++) 
        {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) 
            {
                int num = queue.poll();
                int lastDigit = num % 10;
                int nextDigit1 = lastDigit - k, nextDigit2 = lastDigit + k;
                
                if (nextDigit1 >= 0)
                    queue.offer(num * 10 + nextDigit1);
                
                if (k != 0 && nextDigit2 < 10)
                    queue.offer(num * 10 + nextDigit2);
            }
        }
        
        int length = queue.size();
        int[] nums = new int[length];
        
        for (int i = 0; i < length; i++)
            nums[i] = queue.poll();
        
        return nums;
    } 
    }
