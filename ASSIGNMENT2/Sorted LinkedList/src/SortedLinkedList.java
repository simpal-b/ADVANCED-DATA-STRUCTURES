class Node {
    private Node head;

    public void insertSorted(int value) {
        Node newNode = new Node(value);

        // Case 1: empty list or insert at beginning
        if (head == null || val < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: insert in middle or end
        Node temp = head;
        while (temp.next != null && temp.next.data < val)
            temp = temp.next;

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        list.insertSorted(30);
        list.insertSorted(10);
        list.insertSorted(20);
        list.insertSorted(25);
        list.insertSorted(40);

        System.out.println("Sorted Inserted List:");
        list.display();
    }
}