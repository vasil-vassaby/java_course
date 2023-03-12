package OOP.homework_02;

/**
 * абстрактный класс - дикое животное
 */
public abstract class WildAnimal extends Animal{
    private String habitat;
    private String dateFound;

    public String getDateFound() {
        return dateFound;
    }

    public String getHabitat() {
        return habitat;
    }

    /**
     * конструктор базового класс - дикое животное
     *
     * @param height   рост
     * @param weight   вес
     * @param eyeColor цвет глаз
     * @param habitat   место обитания
     * @param dateFound дата нахождения
     */
    public WildAnimal(double height, double weight, String eyeColor, String habitat, String dateFound) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateFound = dateFound;
    }
}
