/*
Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.
 */

package homework_05.task_01;


public class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        contacts.add("Petrov", "89196459098");
        contacts.add("Petrov", "89155689212");
        contacts.add("Ivanov", "89168880967");
        contacts.add("Sidorov", "89101115678");
        contacts.add("Sidorov", "89198005432");
        contacts.printAll();
        contacts.printContact("Ivanov");
        contacts.printContact("Demidov");
        contacts.findNumber("Petrov");
        contacts.delete("Petrov");
        contacts.printAll();
    }
}
