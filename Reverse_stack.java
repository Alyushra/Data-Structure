class Reverse_stack{
    public static String reverseString(String str) {
        if (str == null || str.length() == 0) return str;

        char[] stack = new char[str.length()];
        int top = -1;

        for (int i = 0; i < str.length(); i++) {
            stack[++top] = str.charAt(i);
        }

        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = stack[top--];
        }

        return new String(result);
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverseString(str)); 
    }
}