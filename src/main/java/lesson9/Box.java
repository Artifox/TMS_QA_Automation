package lesson9;

public class Box<T,E> {
    T item;
    E item2;

    public Box(T item, E item2) {
        this.item = item;
        this.item2 = item2;
    }

    public T getItem() {
        return item;
    }

    public E getItem2() {
        return item2;
    }
}
