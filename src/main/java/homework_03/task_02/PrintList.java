package homework_03.task_02;

import java.util.ArrayList;

public class PrintList {
    public static void printList(ArrayList<Integer> list){
        for (Object x: list)
        {
            System.out.print(x + " ");
        }
    }
}
