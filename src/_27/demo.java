package _27;

public class demo {
    public static void main(String[] args) {
        hashtab h = new hashtab();
        h.add(1, 1);
        h.add(2, 2);
        h.add(3, 3);
        h.add(4, 4);
        h.add(5, 5);
        h.add(6, 6);
        h.add(7, 7);
        h.add(8, 8);
        h.add(9, 10);
        h.add(10, 9);
        System.out.println(h);
        System.out.println(h.find(3));
        h.remove(3);
        System.out.println(h.find(3));
        System.out.println(h);
    }
}
