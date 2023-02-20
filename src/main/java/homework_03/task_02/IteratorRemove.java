package homework_03.task_02;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {
    public static ArrayList<Integer> remove(ArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            if (iterator.next()%2 == 0){
                iterator.remove();
            }
        }
        return list;
    }
}
