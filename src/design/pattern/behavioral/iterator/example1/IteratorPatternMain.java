package src.design.pattern.behavioral.iterator.example1;

public class IteratorPatternMain {
    public static void main(String[] args) {
        AirForce airForce = new AirForce();

        CustomIterator<IAircraft> airForceIterator = new AirForceIterator(airForce);
        while(airForceIterator.hasNext()){
            IAircraft aircraft = airForceIterator.next();
            aircraft.getDetails();
        }
    }
}
