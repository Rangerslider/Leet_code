class Solution {
    public int largestRectangleArea(int[] h) {
        
        int n = h.length, i = 0, max = 0;
    
        Stack<Integer> s = new Stack<>();  
        
        
        while (i < n) {        //current value  is shorter than the last one ,popping out the stack and calculate the area then popped
            
          while (!s.isEmpty() && h[i] < h[s.peek()]) { 
            max = Math.max(max, h[s.pop()] * (i - (s.isEmpty() ? 0 : s.peek() + 1)));      //index    handeling korsi left bound
          }
          s.push(i++);          // input current value  index -> stack
            
            
        }
        
        while (!s.isEmpty()) {
          max = Math.max(max, h[s.pop()] * (n - (s.isEmpty() ? 0 : s.peek() + 1)));
        }
        return max;
    }                      //  pop out any value  left in the stack and calculate the area based 
}