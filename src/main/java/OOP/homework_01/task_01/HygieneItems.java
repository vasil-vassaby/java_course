package OOP.homework_01.task_01;

public class HygieneItems extends Product {

    private int countInPackage;

    public HygieneItems(String name, int price, int quantity, String unit, int countInPackage) {
        super(name, price, quantity, unit);
        this.countInPackage = countInPackage;
    }
    @Override
    public String toString() {
        return super.toString() + " с количеством штук в упаковке - " + countInPackage;
    }
}
