public class Main {
    public static void main(String[] args) {
        TreeBST treeBST = new TreeBST();
        treeBST.addNode(8);
        treeBST.addNode(3);
        treeBST.addNode(10);
        treeBST.addNode(2);
        treeBST.addNode(15);
        treeBST.addNode(6);
        treeBST.addNode(14);
        treeBST.addNode(4);
        treeBST.addNode(7);
        treeBST.addNode(9);
        treeBST.preOrder();
        treeBST.depthNode(10);
        treeBST.getSuccesor(15);


    }
}