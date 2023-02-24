package homework_04.task_02;

import java.util.LinkedList;

public class MyQueue {
/* enqueue() - помещает элемент в конец очереди,
 dequeue() - возвращает первый элемент из очереди и удаляет его,
 first() - возвращает первый элемент из очереди, не удаляя. */
    LinkedList<Integer> list = new LinkedList<>();

    void enqueue(int item){
        if (list.size() == 0) { list.addFirst(item); }
        else { list.addLast(item); }
    }

    Integer dequeue(){
        if (list.size() != 0) { return list.pollFirst(); }
        return null;
    }

    Integer first(){
        if (list.size() != 0) { return list.getFirst(); }
        return null;
    }
}
