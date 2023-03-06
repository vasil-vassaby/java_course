package OOP.homework_01.task_01;

public class Lemonade extends Drink{
    public Lemonade(String name, int price, int quantity, String unit, double volume, String unitVolume) {
        super(name, price, quantity, unit, volume, unitVolume);
    }

    @Override
    public String toString() {
        return "лимонад " + super.toString();
    }
}
