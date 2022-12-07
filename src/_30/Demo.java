package _30;

public class Demo {
    public static void main(String[] args) {
        BTree tree = new BTree();
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
        tree.reverse();
        tree.printTree();
        System.out.println("");
        //tree.reverse();
        tree.printTree();
        System.out.println("");
        System.out.println(tree.lookup(1));
        System.out.println(tree.getMaxWidth());
        System.out.println(tree.height());
    }
}
