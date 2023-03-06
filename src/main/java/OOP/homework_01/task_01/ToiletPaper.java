package OOP.homework_01.task_01;

public class ToiletPaper extends HygieneItems{
    private int numberOfLayers;

    public ToiletPaper(String name, int price, int quantity, String unit, int countInPackage, int numberOfLayers) {
        super(name, price, quantity, unit, countInPackage);
        this.numberOfLayers = numberOfLayers;
    }
    @Override
    public String toString() {
        return "туалетную бумагу " + super.toString() + " и с кол-вом слоев бумаги - " + numberOfLayers;
    }
}
