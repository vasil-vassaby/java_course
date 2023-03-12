package OOP.homework_02;
/**
 * абстрактный класс - Птица
 */
public abstract class Bird extends Animal implements Flying{
    private double altitudeFlight;

    public double getAltitudeFlight() {
        return altitudeFlight;
    }

    /**
     * конструктор базового класс - Птица
     *
     * @param height         рост
     * @param weight         вес
     * @param eyeColor       цвет глаз
     * @param altitudeFlight высота полета
     */
    public Bird(double height, double weight, String eyeColor, double altitudeFlight) {
        super(height, weight, eyeColor);
        this.altitudeFlight = altitudeFlight;
    }
    private Bird(double altitudeFlight){
        this.altitudeFlight = altitudeFlight;
    }
}