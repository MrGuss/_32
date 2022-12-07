package lists1;

import java.util.ArrayList;

public class container {
    ArrayList<student> list;

    public container(){
        this.list = new ArrayList<>();
    }

    public void add(student st){
        list.add(st);
    }

    public String listAll(){
        String out = "";
        for (int i=0; i<list.size(); i++){
            out += i+". " + list.get(i).getFirstname() + " " + list.get(i).getLastname() + "\n";
        }
        return out;
    }

    public void remove(int index){
        list.remove(index);
    }

    public String print(int index){
        return list.get(index).toString();
    }

    public void clear(){
        list.clear();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
