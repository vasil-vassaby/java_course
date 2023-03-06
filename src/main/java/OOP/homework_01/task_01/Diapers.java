package OOP.homework_01.task_01;

public class Diapers extends ChildensGoods{
    private String size;
    private int minWeight;
    private int maxWeight;
    private String type;

    public Diapers(String name, int price, int quantity, String unit, int minAge, String unitAge,
                   boolean hypoallergenicity, String size, int minWeight, int maxWeight, String type) {
        super(name, price, quantity, unit, minAge, unitAge, hypoallergenicity);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "подгузники " + super.toString() +
                ", размер - " + size +
                " (" + minWeight + " - " + maxWeight + "кг)" +
                ", тип - " + type;
    }
}
