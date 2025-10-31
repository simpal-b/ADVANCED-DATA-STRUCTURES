import java.util.*;

// ==================== 1. Singly Circular Linked List using Tail Pointer =====================
class SinglyCircularList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node tail;

    public SinglyCircularList() {
        tail = null;
    }

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Add at Position
    public void addAtPosition(int pos, int data) {
        Node newNode = new Node(data);
        if (tail == null || pos <= 1) {
            if (tail == null) {
                tail = newNode;
                tail.next = tail;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
            }
            return;
        }

        Node trav = tail.next;
        for (int i = 1; i < pos - 1 && trav != tail; i++)
            trav = trav.next;

        newNode.next = trav.next;
        trav.next = newNode;

        if (trav == tail)
            tail = newNode;
    }

    // Delete at Position
    public void deleteAtPosition(int pos) {
        if (tail == null)
            return;

        Node trav = tail.next;

        if (pos == 1) {
            if (tail == tail.next)
                tail = null;
            else {
                tail.next = trav.next;
            }
            return;
        }

        for (int i = 1; i < pos - 1 && trav.next != tail.next; i++)
            trav = trav.next;

        Node temp = trav.next;
        trav.next = temp.next;

        if (temp == tail)
            tail = trav;
    }

    // Display
    public void display() {
        if (tail == null) {
            System.out.println("List empty");
            return;
        }
        Node trav = tail.next;
        do {
            System.out.print(trav.data + " ");
            trav = trav.next;
        } while (trav != tail.next);
        System.out.println();
    }

    // Count nodes
    public int count() {
        if (tail == null)
            return 0;
        int cnt = 0;
        Node trav = tail.next;
        do {
            cnt++;
            trav = trav.next;
        } while (trav != tail.next);
        return cnt;
    }
}

// ==================== 3. Doubly Linear Linked List of Employees =====================
class Employee {
    int empid;
    String name;
    double salary;

    Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "EmpID: " + empid + ", Name: " + name + ", Salary: " + salary;
    }
}

class DoublyLinkedList {
    class Node {
        Employee data;
        Node next, prev;

        Node(Employee data) {
            this.data = data;
        }
    }

    private Node head, tail;

    // Add at end
    public void addEmployee(Employee emp) {
        Node newNode = new Node(emp);
        if (head == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Display all
    public void display() {
        Node trav = head;
        while (trav != null) {
            System.out.println(trav.data);
            trav = trav.next;
        }
    }

    // Search by name
    public void searchByName(String name) {
        Node trav = head;
        boolean found = false;
        while (trav != null) {
            if (trav.data.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + trav.data);
                found = true;
            }
            trav = trav.next;
        }
        if (!found)
            System.out.println("Employee not found.");
    }

    // Delete by empid
    public void deleteById(int empid) {
        Node trav = head;
        while (trav != null && trav.data.empid != empid)
            trav = trav.next;

        if (trav == null) {
            System.out.println("Employee not found.");
            return;
        }

        if (trav == head)
            head = trav.next;
        if (trav == tail)
            tail = trav.prev;
        if (trav.prev != null)
            trav.prev.next = trav.next;
        if (trav.next != null)
            trav.next.prev = trav.prev;

        System.out.println("Employee deleted.");
    }

    // Update salary
    public void updateSalary(int empid, double newSalary) {
        Node trav = head;
        while (trav != null) {
            if (trav.data.empid == empid) {
                trav.data.salary = newSalary;
                System.out.println("Salary updated successfully.");
                return;
            }
            trav = trav.next;
        }
        System.out.println("Employee not found.");
    }
}

// ==================== MAIN MENU =====================
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyCircularList scl = new SinglyCircularList();
        DoublyLinkedList dll = new DoublyLinkedList();
        int choice;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Singly Circular List (Add/Delete/Display)");
            System.out.println("2. Doubly Linked List (Employee Management)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int ch1;
                    do {
                        System.out.println("\n--- Singly Circular List ---");
                        System.out.println("1. Add Last");
                        System.out.println("2. Add at Position");
                        System.out.println("3. Delete at Position");
                        System.out.println("4. Display");
                        System.out.println("5. Count Nodes");
                        System.out.println("0. Back");
                        System.out.print("Enter choice: ");
                        ch1 = sc.nextInt();

                        switch (ch1) {
                            case 1:
                                System.out.print("Enter data: ");
                                scl.addLast(sc.nextInt());
                                break;
                            case 2:
                                System.out.print("Enter position and data: ");
                                scl.addAtPosition(sc.nextInt(), sc.nextInt());
                                break;
                            case 3:
                                System.out.print("Enter position: ");
                                scl.deleteAtPosition(sc.nextInt());
                                break;
                            case 4:
                                scl.display();
                                break;
                            case 5:
                                System.out.println("Total nodes: " + scl.count());
                                break;
                        }
                    } while (ch1 != 0);
                    break;

                case 2:
                    int ch2;
                    do {
                        System.out.println("\n--- Employee Management ---");
                        System.out.println("1. Add Employee");
                        System.out.println("2. Display All");
                        System.out.println("3. Search by Name");
                        System.out.println("4. Delete by EmpID");
                        System.out.println("5. Update Salary");
                        System.out.println("0. Back");
                        System.out.print("Enter choice: ");
                        ch2 = sc.nextInt();

                        switch (ch2) {
                            case 1:
                                System.out.print("Enter EmpID, Name, Salary: ");
                                dll.addEmployee(new Employee(sc.nextInt(), sc.next(), sc.nextDouble()));
                                break;
                            case 2:
                                dll.display();
                                break;
                            case 3:
                                System.out.print("Enter name: ");
                                dll.searchByName(sc.next());
                                break;
                            case 4:
                                System.out.print("Enter EmpID: ");
                                dll.deleteById(sc.nextInt());
                                break;
                            case 5:
                                System.out.print("Enter EmpID and new Salary: ");
                                dll.updateSalary(sc.nextInt(), sc.nextDouble());
                                break;
                        }
                    } while (ch2 != 0);
                    break;
            }
        } while (choice != 0);
        sc.close();
        System.out.println("Program exited.");
    }
}