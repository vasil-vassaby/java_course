package OOP.homework_02;

public abstract class Animal {
    private double height;
    private double weight;
    private String eyeColor;



    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    /**
     * конструктор базового класс - животное
     * @param height - рост
     * @param weight - вес
     * @param eyeColor - цвет глаз
     */
    public Animal(double height, double weight, String eyeColor){
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    /**
     * второй конструктор базового класс - животное
     * без параметров
     */
    protected Animal() {
    }

    /**
     * метод любого животного - издавать звук
     */
    protected abstract void makeSound();

    /**
     * метод любого животного - напечатать информацию о своих свойствах
     */
    protected abstract String printInfo();
}
