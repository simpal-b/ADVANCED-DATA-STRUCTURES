public class TreeBST {

    static class Node{
        Node left;
        int data;
        Node right;

        public Node(int value){
            left = null;
            data = value;
            right = null;
        }
    }

    Node root;
    TreeBST(){
        root = null;
    }

    void addNode(int value) {
        System.out.println("1");
        Node newNode = new Node(value);
        System.out.println("2");
        Node trav = root;
        System.out.println("3");
        if (root == null) {
            root = newNode;
        } else {
            System.out.println("6");
            while (trav.left != null || trav.right != null) {
                if (trav.right == null && trav.data < newNode.data) {
                    break;
                }
                if (trav.left == null && trav.data > newNode.data) {
                    break;
                }
                if (trav.data > newNode.data) {
                    trav = trav.left;
                } else {
                    trav = trav.right;
                }
            }
            if (trav.data > newNode.data) {
                trav.left = newNode;
            } else {
                trav.right = newNode;
            }
        }
    }

    void depthNode(int value){
        Node trav = root;
        int count = 0;
        while (value != trav.data){
            if(trav.data > value){
                trav = trav.left;
                count++;
            }else {
                trav = trav.right;
                count++;
            }
        }
        System.out.println("The depth for "+value+" is "+count);
    }

    void getSuccesor(int value){
        Node trav = root;
        int count = 0;
        while (value != trav.data){
            if(trav.data > value){
                trav = trav.left;
                count++;
            }
            else{
                trav = trav.right;
                count++;
            }
        }
        if(trav.right == null){
            System.out.println("Suc of : " + value + "is not present");
        }else{
            System.out.println("Suc of : " + value + " is " + trav.right.data);
        }
    }

    private void preOrder(Node trav){
        if(trav == null)
            return;
        System.out.println(" " + trav.data);
        preOrder(trav.left);
        preOrder(trav.right);
    }
    public void preOrder(){
        System.out.println("Pre Order : ");
        preOrder(root);
        System.out.println(" ");
    }
}
