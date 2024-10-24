package src.design.pattern.behavioral.observer.example2;

public class Boeing implements IAircraft, IObserver{
    private String boeingId;
    private ISubject tower;

    public Boeing(String boeingId, ISubject tower) {
        this.tower = tower;
        this.boeingId = boeingId;
    }

    @Override
    public void takeOff() {
        tower.addObserver(this);
        System.out.println(boeingId + " Subscribed to ATC and Take Off");
    }

    @Override
    public void land() {
        System.out.println(boeingId + " Landed and Unsubscribed to ATC");
        tower.removeObserver(this);
    }

    @Override
    public void proceed(Object newState) {
        System.out.println("I'm on executing the aircraft " + boeingId);
    }
}
