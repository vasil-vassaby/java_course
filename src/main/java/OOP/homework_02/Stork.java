package OOP.homework_02;

public class Stork extends Bird {
    /**
     * конструктор класса - Аист
     *
     * @param height         рост
     * @param weight         вес
     * @param eyeColor       цвет глаз
     * @param altitudeFlight высота полета
     */
    public Stork(double height, double weight, String eyeColor, double altitudeFlight) {
        super(height, weight, eyeColor, altitudeFlight);
    }

    @Override
    protected void makeSound() {
        System.out.println("Цок-цок");
    }

    @Override
    protected String printInfo() {
        return "Аист " +
                "рост " + getHeight() +
                " см, вес " + getWeight() +
                " кг, цвет глаз " + getEyeColor() +
                ", высота полета " + getAltitudeFlight() +
                " м";
    }
}
