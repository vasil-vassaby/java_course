package homework_05.task_02;

import java.util.*;

public class ValueComparator implements Comparator<String> {
    Map<String, Integer> map;

    public ValueComparator(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(String s1, String s2) {
        if (map.get(s1) > map.get(s2)) return -1;
        if (Objects.equals(map.get(s1), map.get(s2))) return -1;
        else return 1;
    }
}
