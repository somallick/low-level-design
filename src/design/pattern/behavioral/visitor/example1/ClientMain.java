package src.design.pattern.behavioral.visitor.example1;

import java.util.Iterator;

public class ClientMain {
    public static void main(String[] args) {

        Fleet fleet = new Fleet();
        ICar scorpio = new Scorpio();
        fleet.addCar(scorpio);
        ICar alto = new Alto();
        fleet.addCar(alto);

        Iterator<ICar> carIterator = fleet.getIterator();

        ICarVisitor insuranceVisitor = new InsurancePriceVisitor();

        while (carIterator.hasNext()) {
            carIterator.next().accept(insuranceVisitor);
        }
    }
}
