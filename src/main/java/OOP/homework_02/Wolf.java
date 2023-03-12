package OOP.homework_02;

public class Wolf extends WildAnimal{
    private boolean leaderOfPack;

    public String isLeaderOfPack() {
        return leaderOfPack ? "да":"нет";
    }

    /**
     * конструктор класса - Волк
     *
     * @param height    рост
     * @param weight    вес
     * @param eyeColor  цвет глаз
     * @param habitat   место обитания
     * @param dateFound дата нахождения
     * @param leaderOfPack вожак стаи
     */
    public Wolf(double height, double weight, String eyeColor, String habitat, String dateFound, boolean leaderOfPack) {
        super(height, weight, eyeColor, habitat, dateFound);
        this.leaderOfPack = leaderOfPack;
    }

    @Override
    protected void makeSound() {
        System.out.println("Аууу-ууу");
    }

    @Override
    protected String printInfo() {
        return "Волк " +
                "рост " + getHeight() +
                " см, вес " + getWeight() +
                " кг, цвет глаз " + getEyeColor() +
                ", место обитания " + getHabitat() +
                ", дата нахождения " + getDateFound() +
                ", вожак стаи - " + isLeaderOfPack();
    }
}
