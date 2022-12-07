package _27;

import java.util.Arrays;

public class hashtab {
    Node[] elems;
    int capacity;

    public hashtab(){
        capacity = 0;
        elems = new Node[1];
    }

    private int hash(Object key){
        return key.hashCode();
    }

    public int find(Object key){
        if (elems[0]==null){
            return 0;
        }
        for (int i=0; i<capacity; i++){
            if (elems[i].getHash()==hash(key)) return 1;
        }
        return 0;
    }

    public void add(Object key, int data){
        if (find(key)==1) {
            for (int i = 0; i < elems.length; i++) {
                if (elems[i].getHash() == hash(key)) {
                    elems[i].setData(data);
                    return;
                }
            }
        }
        else{
            if (capacity==elems.length){
                expand();
            }
            elems[capacity++]=new Node(hash(key), data);
        }
    }

    public int remove(Object key){
        int hsh = hash(key);
        if (find(hsh)==0){
            return 0;
        }

        int pos = 0;
        for (int i=0; i<capacity; i++){
            if (hsh==elems[i].getHash()){
                elems[i] = null;
                pos = i;
                break;
            }
        }
        for (int i=pos; i<capacity-1; i++){
            elems[i]=elems[i+1];
            elems[i+1]=null;
        }
        capacity--;
        return 1;
    }

    private void expand() {
        this.elems = Arrays.copyOf(this.elems, this.elems.length*2);
    }

    @Override
    public String toString() {
        String out = "";
        for (int i=0; i<capacity; i++){
            out+=elems[i]+"\n";
        }
        return out;
    }
}
