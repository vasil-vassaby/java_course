package homework_04.task_01;

class LinkedList {
    static Node head;

    static class Node {
        // class Node  -> узел двусвязного LinkedList
        private int data; // данные - в нашем случае это целочисленное значение
        Node next, prev; // cсылки на следующий и предыдущий элемент списка соответственно

        Node(int data) // конструктор нового узла
        {
            this.data = data;
            next = prev = null; // по умолчанию в начале узел имеет ссылки со значением null
        }
    }

    // функция реверс для двусвязного списка
    void reverse() {
        // задаем точку отсчета - начало списка
        Node temp = null;
        Node current = head;

        // с точки отсчета меняем местами ссылки следующего и предыдущего элемента при обходе узлов списка
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // Прежде чем менять голову, проверяем такие случаи, как пустой список и список только с одним узлом
        if (temp != null) {
            head = temp.prev;
        }
    }

    // для теста - функция добавления узла в начало списка
    void push(int new_data) {
        // создаем новый узел
        Node new_node = new Node(new_data);

        // так как мы вставляем узел в начало, то предыдущий элемент всегда со значением null
        new_node.prev = null;

        // связываем список с новым узлом
        new_node.next = head;

        // изменяем предыдущий элемент на новый
        if (head != null) {
            head.prev = new_node;
        }

        // после этого новый узел определяем как начало списка
        head = new_node;
    }

    // функция печати списка
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}



