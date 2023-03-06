package OOP.homework_01.task_01;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("какой-то товар", 52, 5, "шт.");
        Product food = new Food("сыр", 159, 1, "шт.", 1, "мес.");
        Product drink = new Drink("пиво", 68, 1, "шт.", 0.5, "л.");
        Product hygieneItems = new HygieneItems("ватные диски", 60, 1, "упак.", 36);
        Product childensGoods = new ChildensGoods("подгузники", 1500, 2, "упак.", 6,
                "мес.", true);
        Food milk = new Milk("'Домик в деревне'",59, 1, "пак.", 1,
                "мес.", 3.2);
        Drink lemonade = new Lemonade("'Буратино'",47, 1, "шт.", 1.5, "л.");
        Food bread = new Bread("'Бородинский'",46, 1, "шт.", 3,
                "дн.", "для выпечки.");
        Food eggs = new Eggs("'Категория С1'",250, 1, "лот.", 14,
                "дн.", 30);
        HygieneItems masks = new Masks("'Одноразовые'", 10, 1, "упак.", 12);
        HygieneItems toiletPaper = new ToiletPaper("'Zewa'", 80, 1, "упак.", 4,
                150);
        ChildensGoods diapers = new Diapers("'Haggies'", 2500, 1, "упак.", 9,
                "мес.", true, "L", 9, 14, "одноразовые.");
        ChildensGoods pacifier = new Pacifier("'Haggies'", 250, 1, "шт.", 3,
                "мес.", true);

        Program.buy(product);
        Program.buy(food);
        Program.buy(drink);
        Program.buy(hygieneItems);
        Program.buy(childensGoods);
        Program.buy(milk);
        Program.buy(lemonade);
        Program.buy(bread);
        Program.buy(eggs);
        Program.buy(masks);
        Program.buy(toiletPaper);
        Program.buy(diapers);
        Program.buy(pacifier);
    }
}
