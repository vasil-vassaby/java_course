package OOP.homework_01.task_01;

public class Bread extends Food{
    private String typeOfFlour;

    public Bread(String name, int price, int quantity, String unit, int bestBeforeDate, String unitBestBeforeDate, String typeOfFlour) {
        super(name, price, quantity, unit, bestBeforeDate, unitBestBeforeDate);
        this.typeOfFlour = typeOfFlour;
    }
    @Override
    public String toString() {
        return "хлеб " + super.toString() + ", тип муки - " + typeOfFlour;
    }
}
