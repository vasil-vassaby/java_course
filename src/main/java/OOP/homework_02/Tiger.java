package OOP.homework_02;

public class Tiger extends WildAnimal{

    /**
     * конструктор класса - Тигр
     *
     * @param height    рост
     * @param weight    вес
     * @param eyeColor  цвет глаз
     * @param habitat   место обитания
     * @param dateFound дата нахождения
     */
    public Tiger(double height, double weight, String eyeColor, String habitat, String dateFound) {
        super(height, weight, eyeColor, habitat, dateFound);
    }

    @Override
    protected void makeSound() {
        System.out.println("Арррр-ррр");
    }

    @Override
    protected String printInfo() {
        return "Тигр " +
                "рост " + getHeight() +
                " см, вес " + getWeight() +
                " кг, цвет глаз " + getEyeColor() +
                ", место обитания " + getHabitat() +
                ", дата нахождения " + getDateFound();
    }
}
