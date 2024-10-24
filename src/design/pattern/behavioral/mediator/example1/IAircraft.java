package src.design.pattern.behavioral.mediator.example1;

public interface IAircraft {
    void requestTakeoff();
    void requestLanding();
    void notifyAirTrafficControl(String message);
}
