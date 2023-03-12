package OOP.homework_02;
/**
 * абстрактный класс - домашнее животное
 */
public abstract class HomeAnimal extends Animal implements Endearing{
    private String nickname;
    private String breed;
    private boolean haveVaccinations;
    private String colorСoat;
    private String dateOfBirth;

    public String getNickname() {
        return nickname;
    }

    public String getBreed() {
        return breed;
    }

    public String isHaveVaccinations() {
        return haveVaccinations? "да": "нет";
    }

    public String getColorСoat() {
        return colorСoat;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * конструктор базового класс - домашнее животное
     *
     * @param height рост
     * @param weight вес
     * @param eyeColor цвет глаз
     * @param nickname кличка
     * @param breed порода
     * @param haveVaccinations наличие прививок
     * @param colorСoat цвет шерсти
     * @param dateOfBirth дата рождения
     */
    public HomeAnimal(double height, double weight, String eyeColor,
                      String nickname, String breed, boolean haveVaccinations,
                      String colorСoat, String dateOfBirth) {
        super(height, weight, eyeColor);
        this.nickname = nickname;
        this.breed = breed;
        this.haveVaccinations = haveVaccinations;
        this.colorСoat = colorСoat;
        this.dateOfBirth = dateOfBirth;
    }
}
