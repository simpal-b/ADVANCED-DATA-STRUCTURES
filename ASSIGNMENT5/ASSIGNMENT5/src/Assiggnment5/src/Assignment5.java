import java.util.*;

class Node {
    int data;
    Node next, prev;
    Node(int data) { this.data = data; }
}

class DoubleEndedQueue {
    Node front, rear;

    // Add at front
    public void addFront(int val) {
        Node newNode = new Node(val);
        if (front == null)
            front = rear = newNode;
        else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    // Add at rear
    public void addRear(int val) {
        Node newNode = new Node(val);
        if (rear == null)
            front = rear = newNode;
        else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    // Delete from front
    public void deleteFront() {
        if (front == null) return;
        front = front.next;
        if (front != null) front.prev = null;
        else rear = null;
    }

    // Delete from rear
    public void deleteRear() {
        if (rear == null) return;
        rear = rear.prev;
        if (rear != null) rear.next = null;
        else front = null;
    }

    // Display elements
    public void display() {
        Node trav = front;
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }
}

public class Assignment5 {
    // 2️⃣ Modified Insertion Sort (Descending)
    public static void insertionSortDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        DoubleEndedQueue dq = new DoubleEndedQueue();
        dq.addFront(10);
        dq.addRear(20);
        dq.addFront(5);
        dq.display();
        dq.deleteRear();
        dq.display();

        int[] arr = {5, 3, 8, 2, 9};
        insertionSortDescending(arr);
        System.out.println("Sorted (Descending): " + Arrays.toString(arr));
    }
}
