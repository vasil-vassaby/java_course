package OOP.homework_04;

import OOP.seminar_04.Cat;

public class Program {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("vasa");
        list.add("dusa");
        list.add("kisa");
        list.add("dusa");
        list.add("lisa");
        list.add("dusa");
        list.sum();
        list.multiply();
        //list.removeIf("dusa");
        //list.printInfo();
        MyArrayList<Integer> integerList = new MyArrayList<>(new Integer[]{2, 3, 6, 5, 10, 1});
        MyArrayList<Double> doubleMyArrayListList = new MyArrayList<>(new Double[]{2.3, 3.0, 6.5, 5.7, 10.0, 1.0});
//        System.out.println(integerList.size());
//        System.out.println(list.size());
//        integerList.min();
//        integerList.max();
        integerList.sum();
        integerList.multiply();
        doubleMyArrayListList.sum();
        doubleMyArrayListList.multiply();
        //integerList.printInfo();
        System.out.println();
        //integerList.selectionSort();
        //integerList.printInfo();
        //System.out.println();
        //integerList.bubbleSort();
        //integerList.printInfo();
//        list.bubbleSort();
//        list.insertionSort();
//        list.printInfo();
//        MyArrayList<Cat> listCat = new MyArrayList<Cat>();
//        listCat.add(new Cat("vasik", 60));
//        listCat.add(new Cat("basik", 50));
//        listCat.add(new Cat("zasik", 70));
        //listCat.bubbleSort();
//        listCat.insertionSort();
//        listCat.printInfo();
    }
}
