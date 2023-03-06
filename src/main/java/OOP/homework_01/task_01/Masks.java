package OOP.homework_01.task_01;

public class Masks extends HygieneItems{

    public Masks(String name, int price, int quantity, String unit, int countInPackage) {
        super(name, price, quantity, unit, countInPackage);
    }
    @Override
    public String toString() {
        return "маски " + super.toString();
    }
}
