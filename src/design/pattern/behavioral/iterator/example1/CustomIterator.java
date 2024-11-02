package src.design.pattern.behavioral.iterator.example1;

public interface CustomIterator<T> {
    T next();
    boolean hasNext();
}
