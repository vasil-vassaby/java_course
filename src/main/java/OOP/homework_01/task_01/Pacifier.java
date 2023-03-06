package OOP.homework_01.task_01;

public class Pacifier extends ChildensGoods{

    public Pacifier(String name, int price, int quantity, String unit, int minAge, String unitAge, boolean hypoallergenicity) {
        super(name, price, quantity, unit, minAge, unitAge, hypoallergenicity);
    }

    @Override
    public String toString() {
        return "соску " + super.toString();
    }
}
