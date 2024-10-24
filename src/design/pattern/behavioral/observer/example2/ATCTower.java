package src.design.pattern.behavioral.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class ATCTower implements ISubject{
    List<IObserver> observerList;

    public ATCTower() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer:observerList) {
            observer.proceed(this);
        }
    }
}
