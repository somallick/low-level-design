package src.design.pattern.behavioral.mediator.example1;

/*
* In an airport, there are multiple airplanes that need to communicate and coordinate their movements
* to avoid collisions and ensure safe takeoffs and landings. Without a centralized system,
* direct communication between airplanes could lead to chaos and increased risk.
*/
public class MediatorAirplaneExample {
    public static void main(String[] args) {
        // Instantiate the Mediator (Airport Control Tower)
        AirTrafficControlTower controlTower = new AirportControlTower();

        // Instantiate Concrete Colleagues (Commercial Airplanes)
        IAircraft indigo = new CommercialAircraft(controlTower, "IG001");
        IAircraft airIndia = new CommercialAircraft(controlTower, "AI001");

        // Set up the association between Concrete Colleagues and the Mediator
        indigo.requestTakeoff();
        airIndia.requestLanding();

    }
}
