package OOP.homework_02;

import java.util.ArrayList;

/*
Реализовать класс "Зоопарк", в котором будет храниться любая структура данных животных(массив, стек, очередь),
в котором организовать приватный массив объектов-животных со следующими методами:
1. Добавить животное в зоопарк(добавляет новое животное в структуру данных, для массива использовать следующий алгоритм https://gospodaretsva.com/urok-27-vstavka-elementov-v-massiv.html , для стека и очереди вы алгоритмы уже знаете)
2. Убирает животное с номером i из зоопарка(Использовать этот алгоритм https://gospodaretsva.com/urok-26-udalenie-elementa-iz-odnomernogo-massiva.html для удаления из массива, для удаления из стека и очереди вы алгоритмы знаете)
3. Посмотреть информацию о животном с номером i
4. Заставить животное с номером i издать звук
5. Напечатать информацию о животных, которые есть на данный момент в зоопарке
6. Заставить всех животных, которые на данный момент есть в зоопарке, издать звук
 */
public class Zoo {
    private ArrayList<Animal> animals= new ArrayList<>();

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    protected ArrayList<Animal> addAnimal(Animal animal) {
        animals.add(animal);
        return animals;
    }
    protected void printAllAnimal() {
        if (!animals.isEmpty()) {
            System.out.println("Животные в зоопарке: ");
            for (Animal animal : animals) {
                System.out.println(animal.printInfo() + "; ");
            }
        } else System.out.println("В зоопарке нет животных!");
    }
    protected void removeAnimal(int index) throws Exception{
        if (animals.size() == 0) throw new Exception("В зоопарке нет животных!");
        animals.remove(index);
    }
    protected void viewInfoAnimal(int index){
        try {
            System.out.println((animals.get(index)).printInfo());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы списка животных в зоопарке!");
        }
    }
    protected void makeSoundAllAnimal(){
        if (!animals.isEmpty()) {
            System.out.println("Звуки животных в зоопарке: ");
            for (Animal animal : animals) {
                System.out.print(animal.getClass().getSimpleName() + " - ");
                animal.makeSound();
            }
        } else System.out.println("В зоопарке нет животных!");
    }
    protected void makeSoundAnimal(int index){
        try {
            System.out.print(animals.get(index).getClass().getSimpleName() + " - ");
            animals.get(index).makeSound();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы списка животных в зоопарке!");
        }
    }
}
