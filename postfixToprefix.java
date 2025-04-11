class postfixToprefix{
    public static String postfixToPrefix(String postfix) {
        char[] stack = new char[postfix.length()];
        int top = -1;
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                stack[++top] = ch;
            } 
            else {
                char op2 = stack[top--]; 
                char op1 = stack[top--]; 
                char[] temp = new char[3];
                temp[0] = ch;
                temp[1] = op1;
                temp[2] = op2;
                stack[++top] = (char) (top + 100); 
                if (top == 0) {
                    return new String(temp);
                }
                stack[top] = temp[0];
                stack[++top] = temp[1];
                stack[++top] = temp[2];
            }
        }
        return new String(stack, 0, top + 1);
    }

    public static void main(String[] args) {
        String postfix = "AB+";
        System.out.println("Postfix: " + postfix);
        System.out.println("Prefix: " + postfixToPrefix(postfix)); 
    }
}