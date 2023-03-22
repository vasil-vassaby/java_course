package OOP.homework_04;

/**
 * Интерфейс общих методов для внутреннего массива данных
 * @param <T> тип переменной
 */
public interface Implementable<T>{
    void add(T e);
    void remove(int index);
    void removeIf(T e);
    T get(int index);
    int size();
    T set(int index, T e);
    int indexOf(T e);
    boolean contains(T e);
    void printInfo();
}
