package OOP.homework_01.task_01;

public class Food extends Product{
    private int bestBeforeDate;
    private String unitBestBeforeDate;

    public Food(String name, int price, int quantity, String unit, int bestBeforeDate, String unitBestBeforeDate) {
        super(name, price, quantity, unit);
        this.bestBeforeDate = bestBeforeDate;
        this.unitBestBeforeDate = unitBestBeforeDate;
    }

    @Override
    public String toString() {
        return super.toString() + " cо сроком годности - " + bestBeforeDate + " " + unitBestBeforeDate;
    }
}
