package homework_05.task_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contacts {
    private Map<String, List<String>> phonebook = new HashMap<>();

    void add(String name, String number){
        //System.out.println("Номер " + number + " добавлен в контакт " + name);
        if (phonebook.containsKey(name)) {
            phonebook.get(name).add(number);
        }
        else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            phonebook.put(name,numbers);
        }
    }

    void delete(String name){
        if (phonebook.containsKey(name)) {
            phonebook.remove(name);
            //System.out.println("Контакт " + name + " удален!");
        }
        else System.out.println("Контакт не существует!");
    }

    void findNumber(String name){
        if (!phonebook.isEmpty()) {
            if (phonebook.containsKey(name)) System.out.println("Номер(а) контакта: " + phonebook.get(name));
            else System.out.println("Контакт не найден!");
        }
        else System.out.println("Телефонная книга пуста!");
    }

    void printAll(){
        if (!phonebook.isEmpty()){
            System.out.println("-----------Все контакты-----------");
            for (Map.Entry<String, List<String>> phone: phonebook.entrySet()) {
                System.out.println(phone);
            }
            System.out.println("----------------------------------");
        }
        else System.out.println("Телефонная книга пуста!");
    }

    void printContact(String name){
        if (phonebook.containsKey(name)) {
            for (Map.Entry entry : phonebook.entrySet()) {
                if (entry.getKey().equals(name)) {
                    System.out.println("---------Искомый контакт---------");
                    System.out.println(entry);
                    System.out.println("---------------------------------");
                }
            }
        } else {
            System.out.println("Искомого контакта не существует");
            System.out.println("---------------------------------");
        }
    }
}
