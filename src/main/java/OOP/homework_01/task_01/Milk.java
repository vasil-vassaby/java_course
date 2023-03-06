package OOP.homework_01.task_01;

public class Milk extends Food{
    private double fatPercentage;
    public Milk(String name, int price, int quantity, String unit, int bestBeforeDate, String unitBestBeforeDate, double fatPercentage) {
        super(name, price, quantity, unit, bestBeforeDate, unitBestBeforeDate);
        this.fatPercentage = fatPercentage;
    }

    @Override
    public String toString() {
        return "молоко " + super.toString() + " и с процентом жирности - " + fatPercentage + "%";
    }
}
