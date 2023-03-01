package homework_06;

import java.util.Set;

public class OutputLaptop {
    public static void printList(Set<Laptop> setLaptop){
        System.out.println("==================== laptops in a store ===================".toUpperCase());
        System.out.println("---------------------------start---------------------------");
        setLaptop.forEach(System.out::println);
        System.out.println("----------------------------end----------------------------");
    }
}
