package OOP.homework_02;

public class Dog extends HomeAnimal implements Trained{
    private boolean training;

    public String isTraining() {
        return training? "да": "нет";
    }

    /**
     * конструктор класса - Собака
     *
     * @param height           рост
     * @param weight           вес
     * @param eyeColor         цвет глаз
     * @param nickname         кличка
     * @param breed            порода
     * @param haveVaccinations наличие прививок
     * @param colorСoat        цвет шерсти
     * @param dateOfBirth      дата рождения
     * @param training         наличие дрессировки
     */
    public Dog(double height, double weight, String eyeColor, String nickname, String breed, boolean haveVaccinations, String colorСoat, String dateOfBirth, boolean training) {
        super(height, weight, eyeColor, nickname, breed, haveVaccinations, colorСoat, dateOfBirth);
        this.training = training;
    }

    @Override
    protected void makeSound() {
        System.out.println("Гав-гав");
    }

    @Override
    protected String printInfo() {
        return "Собака по" +
                " кличке '" + getNickname() +
                "', порода - " + getBreed() +
                ", дата рождения " + getDateOfBirth() +
                " г, рост " + getHeight() +
                " см, вес " + getWeight() +
                " кг, цвет глаз: " + getEyeColor() +
                ", наличие прививок - " + isHaveVaccinations() +
                ", цвет шерсти: " + getColorСoat() +
                ", наличие дрессировки - " + isTraining();
    }

    @Override
    public void caress() {
        System.out.println("Я ласкаюсь скуля!");
    }

    public void train(){
        System.out.println("Я собака и меня можно дрессировать!");
    }

}
