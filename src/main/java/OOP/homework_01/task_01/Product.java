package OOP.homework_01.task_01;

public class Product {
    private String name;
    int price;
    int quantity;
    String unit;

    /**
     * конструктор для абстракции товара
     * @param name - название продукта
     * @param price - цена продукта
     * @param quantity - количество товара
     * @param unit - единица измерения
     */
    public Product(String name, int price, int quantity, String unit){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    /**
     * переопределение метода для вывода информации о товаре в консоль
     * @return - строку с описанием общих хар-к товара
     */
    @Override
    public String toString() {
        return name +
                " за " + price +
                " руб. в количестве - " + quantity +
                " " + unit;
    }
}
