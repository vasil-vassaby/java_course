package homework_05.task_02;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class CreateMap {
    TreeMap<String, Integer> create(List<String> list){
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (String name: list) {
            int count = Collections.frequency(list, name);
            treeMap.put(name, count);
        }
        return treeMap;
    }
}
