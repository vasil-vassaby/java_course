package homework_06;

import java.util.Scanner;
import java.util.Set;

public class CreateFilter {
   public static void filter(Set<Laptop> setLaptop){
       Scanner sc = new Scanner(System.in);
       do {
           Menu.print();
           String number = sc.next();
           switch (number) {
               case "0":
                   System.exit(0);
               case "1":
                   System.out.println("Enter laptop RAM: ");
                   int ram = sc.nextInt();
                   System.out.println("RAM >= " + ram + "GB laptop(s): ");
                   System.out.println("***********************************************************");
                   setLaptop.stream().filter(lp -> lp.getRam() >= ram).forEach(System.out::println);
                   System.out.println("***********************************************************");
                   break;
               case "2":
                   System.out.println("Enter laptop SSD: ");
                   int ssd = sc.nextInt();
                   System.out.println("SSD >= " + ssd + "GB laptop(s): ");
                   System.out.println("***********************************************************");
                   setLaptop.stream().filter(lp -> lp.getSsd() >= ssd).forEach(System.out::println);
                   System.out.println("***********************************************************");
                   break;
               case "3":
                   System.out.println("Enter laptop OS: ");
                   String os = sc.next();
                   System.out.println(os.toUpperCase() + " OS laptop(s): ");
                   System.out.println("***********************************************************");
                   setLaptop.stream().filter(lp -> lp.getOs().equalsIgnoreCase(os.trim())).forEach(System.out::println);
                   System.out.println("***********************************************************");
                   break;
               case "4":
                   System.out.println("Enter laptop color: ");
                   String color = sc.next();
                   System.out.println(color.toUpperCase() + " color laptop(s): ");
                   System.out.println("***********************************************************");
                   setLaptop.stream().filter(lp -> lp.getColor().equalsIgnoreCase(color.trim())).forEach(System.out::println);
                   System.out.println("***********************************************************");
                   break;
               default:
                   System.out.println("Error! Choose a number from those offered.");
                   break;
           }
       } while (sc.hasNextLine());
       sc.close();
   }
}
