package OOP.homework_02;

public class Chicken extends Bird{
    /**
     * конструктор класса - Курица
     *
     * @param height         рост
     * @param weight         вес
     * @param eyeColor       цвет глаз
     * @param altitudeFlight высота полета
     */
    public Chicken(double height, double weight, String eyeColor, double altitudeFlight) {
        super(height, weight, eyeColor, altitudeFlight);
    }

    @Override
    protected void makeSound() {
        System.out.println("Ко-ко-ко");
    }

    @Override
    protected String printInfo() {
        return "Курица " +
                "рост " + getHeight() +
                " см, вес " + getWeight() +
                " кг, цвет глаз " + getEyeColor() +
                ", высота полета " + getAltitudeFlight() +
                " м";
    }
}
