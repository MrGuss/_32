package _30_2;

public class Demo {
    public static void main(String[] args) {
        BSTree tree = new BSTree();
        tree.addNode(3);
        tree.addNode(1);
        tree.addNode(9);
        tree.addNode(4);
        tree.addNode(5);
        tree.addNode(10);
        tree.addNode(7);
        tree.addNode(8);
        tree.addNode(2);
        tree.addNode(6);
        tree.printTree();
        System.out.println("");
        tree.delete(5);
        tree.printTree();
        System.out.println("");
        tree.deleteTree();
        tree.printTree();
    }
}
