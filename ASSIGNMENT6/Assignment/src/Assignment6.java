import java.util.*;


class BST {
    class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    Node root;


    public void insert(int val) {
        root = insertRec(root, val);
    }

    private Node insertRec(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data)
            root.left = insertRec(root.left, val);
        else if (val > root.data)
            root.right = insertRec(root.right, val);
        return root;
    }


    public int getDepth(Node root, int key, int level) {
        if (root == null) return -1;
        if (root.data == key) return level;

        int left = getDepth(root.left, key, level + 1);
        if (left != -1) return left;

        return getDepth(root.right, key, level + 1);
    }
}

public class Assignment6 {

    public static void countWords(String line) {
        String[] words = line.toLowerCase().split("\\W+");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String w : words)
            map.put(w, map.getOrDefault(w, 0) + 1);

        System.out.println("Word occurrences:");
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
    }


    public static int mode(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : arr)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        int maxCount = 0, mode = arr[0];
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() > maxCount) {
                maxCount = e.getValue();
                mode = e.getKey();
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        countWords(line);


        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        System.out.println("Mode of array: " + mode(arr));


        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        int depth = tree.getDepth(tree.root, 60, 0);
        System.out.println("Depth of node 60: " + depth);

        sc.close();
    }
}
