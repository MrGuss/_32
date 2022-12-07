package _32;
public class Main {
    public static void swap(int id, int[] elem, int[] dirs){
        elem[id+dirs[id]]=elem[id]+elem[id + dirs[id]];
        elem[id]=elem[id+dirs[id]]-elem[id];
        elem[id+dirs[id]]=elem[id+dirs[id]]- elem[id];
        if (!(dirs[id]==dirs[id+dirs[id]])){
            dirs[id] = -dirs[id];
            dirs[id-dirs[id]] = -dirs[id-dirs[id]];
        }
    }

    public static void main(String[] args) {
        int len = 3;
        int[] elms = new int[len];
        for (int i=1; i<=len; i++){
            elms[i-1]=i;
        }
        int[] dirs = new int[len];
        for (int i=1; i<=len; i++){
            dirs[i-1]=-1;
        }

        int cnt = 1;
        while (true){
            System.out.print(cnt+": ");
            for (int el : elms){
                System.out.print(el + " ");
            }
            System.out.println("");
            for (int el : dirs){
                //System.out.print(el + " ");
            }
            //System.out.println("");

            int pos = -1;

            for (int i=0; i<len; i++){
                if ((i+dirs[i])>-1 & (i+dirs[i])<len) {
                    if ((elms[i] > elms[dirs[i]+i])){
                        if (pos==-1){
                            pos = i;
                        } else if (elms[pos]<elms[i]) {
                            pos=i;
                        }
                    }
                }
            }
            //System.out.println(pos);
            if (pos==-1){
                break;
            }
            for (int i=0; i<len; i++){
                if (elms[i]>elms[pos]){
                    dirs[i] = -dirs[i];
                }
            }
            swap(pos, elms, dirs);
            cnt+=1;
        }
    }
}