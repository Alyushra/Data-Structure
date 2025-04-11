class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LL_to_array {
    Node head;
    public int[] linkedListToArray() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int[] arr = new int[size];
        temp = head;
        int index = 0;
        while (temp != null) {
            arr[index] = temp.data;
            index++;
            temp = temp.next;
        }
        return arr;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {
        LL_to_array list = new LL_to_array();
        list.append(1);
        list.append(2);
        list.append(3);
        int[] result = list.linkedListToArray();
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}