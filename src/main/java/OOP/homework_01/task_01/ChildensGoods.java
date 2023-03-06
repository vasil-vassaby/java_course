package OOP.homework_01.task_01;

public class ChildensGoods extends Product{
    private int minAge;
    private String unitAge;
    boolean hypoallergenicity;

    public ChildensGoods(String name, int price, int quantity, String unit, int minAge, String unitAge, boolean hypoallergenicity) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.unitAge = unitAge;
        this.hypoallergenicity = hypoallergenicity;
    }

    @Override
    public String toString() {
        if (hypoallergenicity){
            return super.toString() + " минимальный возраст - " + minAge + " " + unitAge + ", не гипоаллергенно";
        } else {
            return super.toString() + " минимальный возраст - " + minAge + " " + unitAge + ", гипоаллергенно";
        }
    }
}