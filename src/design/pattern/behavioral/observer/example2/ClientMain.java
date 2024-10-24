package src.design.pattern.behavioral.observer.example2;

/*
* Scenario - Every Aircraft subscribe to ATC and then take off. After Landed, it uns
*/
public class ClientMain {
    public static void main(String[] args) {
        ATCTower tower = new ATCTower();

        Boeing boeing1 = new Boeing("BG001", tower);
        Boeing boeing2 = new Boeing("BG002", tower);

        boeing1.takeOff();
        boeing1.land();

        Boeing boeing3 = new Boeing("BG003", tower);
        Boeing boeing4 = new Boeing("BG004", tower);

        boeing2.takeOff();
        boeing3.takeOff();
        boeing4.takeOff();

        tower.notifyObservers();
    }
}
