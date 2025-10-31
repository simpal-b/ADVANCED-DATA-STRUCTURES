import java.util.*;

class Employee {
    int empid;
    String name;

    Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    public String toString() {
        return "EmpID: " + empid + ", Name: " + name;
    }
}

public class Assignment4 {

    public static int lastOccurrence(int[] arr, int key) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                lastIndex = i;
        return lastIndex;
    }

    public static void searchEmployeeById(Employee[] emps, int id) {
        for (Employee e : emps)
            if (e.empid == id) {
                System.out.println("Found: " + e);
                return;
            }
        System.out.println("Employee not found!");
    }


    public static void searchEmployeeByName(Employee[] emps, String name) {
        for (Employee e : emps)
            if (e.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + e);
                return;
            }
        System.out.println("Employee not found!");
    }


    public static int binarySearchDescending(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }


    public static int nthOccurrence(int[] arr, int key, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                count++;
            if (count == n)
                return i;
        }
        return -1;
    }


    public static int firstNonRepeating(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int n : arr)
            map.put(n, map.getOrDefault(n, 0) + 1);
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            if (e.getValue() == 1)
                return e.getKey();
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        System.out.println("Last occurrence of 2: " + lastOccurrence(arr, 2));

        Employee[] emps = {
                new Employee(101, "Alice"),
                new Employee(102, "Bob"),
                new Employee(103, "Charlie")
        };
        searchEmployeeById(emps, 102);
        searchEmployeeByName(emps, "Charlie");

        int[] descArr = {9, 8, 7, 5, 3, 1};
        System.out.println("Binary search (Descending) of 7: " + binarySearchDescending(descArr, 7));

        System.out.println("2nd occurrence of 2: " + nthOccurrence(arr, 2, 2));

        int[] nums = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
        System.out.println("First non-repeating element: " + firstNonRepeating(nums));
    }
}
