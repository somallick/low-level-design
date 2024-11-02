package src.design.pattern.behavioral.mediator.example1;

//Mediator
public interface AirTrafficControlTower {
    void requestTakeoff(IAircraft airplane);
    void requestLanding(IAircraft airplane);
}
