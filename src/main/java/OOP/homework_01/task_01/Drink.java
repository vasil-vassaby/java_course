package OOP.homework_01.task_01;

public class Drink extends Product{
    double volume;
    String unitVolume;

    public Drink(String name, int price, int quantity, String unit, double volume, String unitVolume) {
        super(name, price, quantity, unit);
        this.volume = volume;
        this.unitVolume = unitVolume;
    }

    @Override
    public String toString() {
        return super.toString() + " объемом - " + volume + " " + unitVolume;
    }
}
