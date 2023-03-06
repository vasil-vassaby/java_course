package OOP.homework_01.task_01;

public class Eggs extends Food{
    private int countInPackage;
    public Eggs(String name, int price, int quantity, String unit, int bestBeforeDate, String unitBestBeforeDate, int countInPackage) {
        super(name, price, quantity, unit, bestBeforeDate, unitBestBeforeDate);
        this.countInPackage = countInPackage;
    }
    @Override
    public String toString() {
        return "яица " + super.toString() + ", кол-во штук в упаковке - " + countInPackage;
    }
}
