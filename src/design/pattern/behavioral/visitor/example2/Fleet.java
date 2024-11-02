package src.design.pattern.behavioral.visitor.example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fleet {
    List<ICar> carList = new ArrayList<>();

    public Iterator<ICar> getIterator() {
        return carList.iterator();
    }
    public void addCar(ICar car) {
        carList.add(car);
    }
}
