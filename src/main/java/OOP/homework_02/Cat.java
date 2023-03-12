package OOP.homework_02;

public class Cat extends HomeAnimal{
    private boolean haveWool;

    public String isHaveWool() {
        return haveWool? "да": "нет";
    }

    /**
     * конструктор класса - Кот
     *
     * @param height           рост
     * @param weight           вес
     * @param eyeColor         цвет глаз
     * @param nickname         кличка
     * @param breed            порода
     * @param haveVaccinations наличие прививок
     * @param colorСoat        цвет шерсти
     * @param dateOfBirth      дата рождения
     * @param haveWool         наличие шерсти
     */
    public Cat(double height, double weight, String eyeColor, String nickname, String breed, boolean haveVaccinations,
               String colorСoat, String dateOfBirth, boolean haveWool) {
        super(height, weight, eyeColor, nickname, breed, haveVaccinations, colorСoat, dateOfBirth);
        this.haveWool = haveWool;
    }

    @Override
    protected void makeSound() {
        System.out.println("Мяу-мяу");
    }


    @Override
    public void caress() {
        System.out.println("Я ласкаюсь мурлыча!");
    }

    @Override
    protected String printInfo() {
        return "Кот " +
                "по кличке '" + getNickname() +
                "', породой - " + getBreed() +
                ", с датой рождения " + getDateOfBirth() +
                " г, ростом " + getHeight() +
                " см, весом " + getWeight() +
                " кг, с цветом глаз " + getEyeColor() +
                ", наличие прививок - " + isHaveVaccinations() +
                ", наличие шерсти - " + isHaveWool() +
                ", цвет шерсти - " + getColorСoat();
    }
}
