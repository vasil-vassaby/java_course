package homework_06;
/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев -
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */
public class Laptop {
    private int id;
    private String color;
    private String os;
    private int ram;
    private int ssd;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getSsd() {
        return ssd;
    }

    public Laptop(int id, String color, String os, int ram, int ssd){
        this.id = id;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Laptop " + id + " [color: " + color + ", OS: " + os + ", RAM: " + ram + "GB, SSD: " + ssd + "GB]";
    }
}
