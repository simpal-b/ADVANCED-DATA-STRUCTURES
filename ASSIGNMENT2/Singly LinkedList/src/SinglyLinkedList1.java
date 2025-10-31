class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;


    public void insertLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }


    public void insertAfter(int key, int val) {
        Node temp = head;
        while (temp != null && temp.data != key)
            temp = temp.next;
        if (temp == null)
            System.out.println("Node with value " + key + " not found!");
        else {
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }


    public void insertBefore(int key, int val) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.data == key) { // inserting before first node
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            return;
        }
        Node prev = null, curr = head;
        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null)
            System.out.println("Node with value " + key + " not found!");
        else {
            Node newNode = new Node(val);
            prev.next = newNode;
            newNode.next = curr;
        }
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node getHead() {
        return head;
    }
}

public class SinglyLinkedList1 {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);



        System.out.println("Original List:");
        list.display();

        list.insertAfter(20, 25);
        System.out.println("\nAfter inserting 25 after 20:");
        list.display();

        list.insertBefore(30, 28);
        System.out.println("\nAfter inserting 28 before 30:");
        list.display();
    }
}
