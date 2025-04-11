
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

class LL_to_string {
    Node head;

    public String linkedListToString() {
        if (head == null) return "";
        char[] chars = new char[100]; 
        int i = 0;
        Node temp = head;
        while (temp != null) {

            if (temp.data < 0) {
                chars[i++] = '-';
                temp.data = -temp.data;
            }
            if (temp.data == 0) chars[i++] = '0';
            else {
                char[] digits = new char[10];
                int j = 0;
                while (temp.data > 0) {
                    digits[j++] = (char) ('0' + temp.data % 10);
                    temp.data /= 10;
                }
                while (j-- > 0) chars[i++] = digits[j];
            }
            if (temp.next != null) {
                chars[i++] = ',';
            }
            temp = temp.next;
        }
        return new String(chars, 0, i);
    }

    public static void main(String[] args) {
        LL_to_string list = new LL_to_string();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        System.out.println(list.linkedListToString()); 
    }
}