package _30_2;

import java.util.Stack;

public class BSTree {
    private Node root;
    private int dir = 1;
    public BSTree(){
        root = null;
    }

    public void addNode(int value){
        Node cur = root;

        if (root==null){
            root = new Node(value);
            return;
        }
        else{
            while (true) {
                if (cur.getData() == value) {
                    return;
                } else {
                    if (cur.getData() > value) {
                        if (cur.nextL == null) {
                            cur.nextL = new Node(value);
                            cur.nextL.setPrev(cur);
                            return;
                        } else {
                            cur = cur.nextL;
                        }
                    } else {
                        if (cur.nextR == null) {
                            cur.nextR = new Node(value);
                            cur.nextR.setPrev(cur);
                            return;
                        } else {
                            cur = cur.nextR;
                        }
                    }
                }
            }
        }
    }

    public int height(){
        return height(root);
    }
    private int height(Node cur){
        int h1=0,h2=0;
        if(cur==null)return(0);
        if(cur.nextL!=null){h1=height(cur.nextL);}
        if(cur.nextR!=null){h2=height(cur.nextR);}
        return(Math.max(h1,h2)+1);
    }

    public int lookup(int target)
    {
        return lookup(root, target);
    }
    private int lookup(Node cur, int target){
        if (cur == null)
        {
            return(0);
        }
        else
        {
            if (target == cur.data) return(1);
            else
            {
                if (target < cur.data) return (lookup(cur.nextL, target));
                else return (lookup(cur.nextR, target));
            }
        }
    }

    public int getMaxWidth()
    {
        int maxWdth = 0;
        for (int i=1;i<=this.height();i++){
            if (this.getWidth(i)>maxWdth){
                maxWdth=this.getWidth(i);
            }
        }
        return maxWdth;
    }

    public int getWidth(int level){
        return getWidth(root, level);
    }
    private int getWidth(Node root, int level)
    {
        if (root==null) return 0;
        if (level == 1) return 1;
        else if (level > 1) {
            return getWidth(root.nextL, level - 1) + getWidth(root.nextR, level - 1);
        }
        else {
            return 0;
        }
    }

    public int delete(int value){
        if (lookup(value) == 0) {
            return 0;
        }
        Node cur = root;
        while (true){
            if (cur.data==value){
                destroy(cur);
                return 1;
            }
            if (cur.data>value){
                cur = cur.nextL;
            }
            else {
                cur = cur.nextR;
            }
        }
    }
    public void deleteTree(){
        delete(root.data);
    }

    private void destroy(Node target){
        if (target==null) return;
        destroy(target.nextL);
        destroy(target.nextR);
        if (target==root){
            root=null;
        }
        if (target.prev.nextL==target){
            target.prev.nextL=null;
        }
        else {
            target.prev.nextR = null;
        }
    }

    public void printTree() { // метод для вывода дерева в консоль
        Stack globalStack = new Stack(); // общий стек для значений дерева
        globalStack.push(root);
        int gaps = (int) Math.pow(2, height()); // начальное значение расстояния между элементами
        boolean isRowEmpty = false;
        //String separator = "-----------------------------------------------------------------";
        //System.out.println(separator);// черта для указания начала нового дерева
        while (isRowEmpty == false) {
            Stack localStack = new Stack(); // локальный стек для задания потомков элемента
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) { // покуда в общем стеке есть элементы
                Node temp = (Node) globalStack.pop(); // берем следующий, при этом удаляя его из стека
                if (temp != null) {
                    System.out.print(temp.getData()); // выводим его значение в консоли
                    localStack.push(temp.nextL); // соохраняем в локальный стек, наследники текущего элемента
                    localStack.push(temp.nextR);
                    if (temp.nextL != null ||
                            temp.nextR != null)
                        isRowEmpty = false;
                }
                else {
                    System.out.print("__");// - если элемент пустой
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
        }
        //System.out.println(separator);// подводим черту
    }
}
