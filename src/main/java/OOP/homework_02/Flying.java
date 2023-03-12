package OOP.homework_02;
/**
 * интерфейс "умеющий летать"
 */
public interface Flying {
    default void fly(double x){
        System.out.printf("Я лечу на %.1f метрах", x);
    } // задал интерфейс по умолчанию, если нужно могу переопределить его в классе-наследнике
}
