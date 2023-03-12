package OOP.homework_02;

import java.util.Scanner;

public class Menu {
    public static void menu() throws Exception {
        Zoo zoo  = new Zoo();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("================== Меню зоопарка ==================\n" +
                    "1. Добавить животное в зоопарк\n" +
                    "2. Убирать животное с номером i из зоопарка\n" +
                    "3. Посмотреть информацию о животном с номером i\n" +
                    "4. Заставить животное с номером i издать звук\n" +
                    "5. Напечатать информацию о животных в зоопарке\n" +
                    "6. Заставить всех животных в зоопарке, издать звук");
            System.out.println("===================================================");
            System.out.print("Введите цифру меню >>> ");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Выберите животное, которое хотите добавить в зоопарк:\n" +
                            "1. Тигр\n" +
                            "2. Собака\n" +
                            "3. Кошка\n" +
                            "4. Волк\n" +
                            "5. Курица\n" +
                            "6. Аист");
                    System.out.print("Введите цифру для включения животного >>> ");
                    int animal = sc.nextInt();
                    switch (animal) {
                        case 1:
                            zoo.addAnimal(new Tiger(110, 180, "желтый", "саванна", "10.08.17 г."));
                            System.out.println("Тигр добавлен в зоопарк!");
                            break;
                        case 2:
                            zoo.addAnimal(new Dog(15, 8, "голубой", "Шарик", "дворняга", true, "черно-серый", "09.03.2016", true));
                            System.out.println("Собака добавлена в зоопарк!");
                            break;
                        case 3:
                            zoo.addAnimal(new Cat(15, 8, "голубой", "Барсик", "персидский кот", true, "оранжевый", "13.01.2019", true));
                            System.out.println("Кошка добавлена в зоопарк!");
                            break;
                        case 4:
                            zoo.addAnimal(new Wolf(80, 60, "голубой", "лесостепь", "13.06.22 г.", true));
                            System.out.println("Волк добавлен в зоопарк!");
                            break;
                        case 5:
                            zoo.addAnimal(new Chicken(25, 2.5, "коричневый", 1.5));
                            System.out.println("Курица добавлена в зоопарк!");
                            break;
                        case 6:
                            zoo.addAnimal(new Stork(105, 4, "черный", 1500));
                            System.out.println("Аист добавлен в зоопарк!");
                            break;
                        default:
                            System.out.println("Такого животного нет в зоопарке!");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Введите индекс животного, которого хотите убрать из зоопарка >>> ");
                    int index = sc.nextInt();
                    zoo.removeAnimal(index);
                    System.out.println((zoo.getAnimals().get(index)).printInfo() + " убран из зоопарка") ;
                    break;
                case 3:
                    System.out.print("Введите индекс животного, у которого хотите посмотреть информацию >>> ");
                    index = sc.nextInt();
                    zoo.viewInfoAnimal(index);
                    break;
                case 4:
                    System.out.print("Введите индекс животного, у которого хотите услышать как издает звук >>> ");
                    index = sc.nextInt();
                    zoo.makeSoundAnimal(index);
                    break;
                case 5:
                    zoo.printAllAnimal();
                    break;
                case 6:
                    zoo.makeSoundAllAnimal();
                    break;
                default:
                    System.out.println("Нет такого пункта меню!");
            }

        } while (sc.hasNextLine());
        sc.close();
    }
}
