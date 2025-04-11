class Bracket_Check {
    public static boolean isBalanced(String expression) {
        char[] stack = new char[expression.length()];
        int top = -1; 
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(') {
                stack[++top] = ch;
            } else if (ch == ')') {
                if (top == -1) {
                    return false;
                }
                top--; 
            }
        }
        return top == -1;
    }
    public static void main(String[] args) {
        
        String expr1 = "(()())";
        String expr2 = "(()";
        System.out.println(expr1 + ": " + isBalanced(expr1));  
        System.out.println(expr2 + ": " + isBalanced(expr2));  
    }
}