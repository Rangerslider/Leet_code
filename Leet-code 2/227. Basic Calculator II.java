class Solution {
    public int calculate(String s) {
        int res = 0, len = s.length(), a = 0;
        char sign = '+';
        Stack<Integer> stack = new Stack<Integer>();

        if (s == null || len == 0) {
            return 0;
        }
        
        for (int i = 0; i < len; i++) {
            char b = s.charAt(i);//b= current character
            
            if (Character.isDigit(b)) {
                a = a * 10 + (b - '0');
            }
            if (!Character.isDigit(b) && !Character.isWhitespace(b) || i == len - 1) {
                if (sign == '+') {
                    stack.push(a);
                }
                else if (sign == '-') {
                    stack.push(-a);
                }
                else if (sign == '*') {
                    stack.push(stack.pop() * a);
                }
                else if (sign == '/') {
                    stack.push(stack.pop() / a);
                }
                a = 0;
                sign = b;
            }
        }
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
} 