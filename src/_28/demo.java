package _28;

import java.util.HashMap;
import java.util.TreeMap;

public class demo {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "a");
        hmap.put(2, "b");
        hmap.put(3, "c");
        System.out.println(hmap);
        Integer[] keys = hmap.keySet().toArray(new Integer[0]);
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        for (Integer key : keys){
            tmap.put(key, hmap.get(key));
        }
        System.out.println(tmap);
    }
}
