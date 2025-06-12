class Solution {
    public int calculate(String s) {
                Stack<Integer> stack = new Stack<>(); 
        int result = 0;
        int num = 0;
        int sign = 1; 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); 
            } 
            
            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
                if (ch == '+' || ch == '-') {
                    result += sign * num;
                    sign = (ch == '+') ? 1 : -1;
                    num = 0;
                } else if (ch == '(') {
                    stack.push(result);
                    stack.push(sign);   
                    result = 0;
                    sign = 1;
                } else if (ch == ')') {
                    result += sign * num;
                    result *= stack.pop(); 
                    result += stack.pop(); 
                    num = 0;
                }
            }
        }

        result += sign * num;
        return result;
    }
}
