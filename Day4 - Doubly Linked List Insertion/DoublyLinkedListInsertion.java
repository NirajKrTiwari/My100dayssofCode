
package Day4;

public class DoublyLinkedListInsertion {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNodeBefore(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = null;
            head.next = null;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            head.prev = null;
        }
    }

    public void addNodeAfter(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head.prev = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void addNodeAfterSpecificNode(int index, int data) {
        Node newNode = new Node(data);
        Node temp = null;
        Node current = head;
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = newNode;
            head.prev = newNode;
        } else {
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            temp = current.next;
            temp.prev = current;
            current.next = newNode;
            newNode.prev = current;
            newNode.next = temp;

        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Empty");
        } else {

            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedListInsertion s1 = new DoublyLinkedListInsertion();
        s1.addNodeBefore(1);
        s1.addNodeBefore(2);
        s1.addNodeBefore(3);
        s1.addNodeBefore(4);
        s1.addNodeAfter(10);
        s1.addNodeAfterSpecificNode(2, 21);
        s1.display();

    }
}