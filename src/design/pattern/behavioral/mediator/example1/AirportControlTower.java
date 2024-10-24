package src.design.pattern.behavioral.mediator.example1;

//Concrete Mediator
public class AirportControlTower implements AirTrafficControlTower {
    @Override
    public void requestTakeoff(IAircraft airplane) {
        // Logic for coordinating takeoff
        airplane.notifyAirTrafficControl("Requesting takeoff clearance.");
    }

    @Override
    public void requestLanding(IAircraft airplane) {
        // Logic for coordinating landing
        airplane.notifyAirTrafficControl("Requesting landing clearance.");
    }
}
