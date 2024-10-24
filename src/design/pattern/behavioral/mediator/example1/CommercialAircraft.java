package src.design.pattern.behavioral.mediator.example1;

public class CommercialAircraft implements IAircraft{

    private AirTrafficControlTower mediator;
    private String airplaneNumber;

    public CommercialAircraft(AirTrafficControlTower mediator, String airplaneNumber) {
        this.mediator = mediator;
        this.airplaneNumber = airplaneNumber;
    }

    @Override
    public void requestTakeoff() {
        mediator.requestTakeoff(this);
    }

    @Override
    public void requestLanding() {
        mediator.requestLanding(this);
    }

    @Override
    public void notifyAirTrafficControl(String message) {
        System.out.println("Commercial Airplane - " + this.airplaneNumber + " : " + message);
    }
}
