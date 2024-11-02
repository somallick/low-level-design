package src.design.pattern.behavioral.iterator.example1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AirForceIterator implements CustomIterator<IAircraft>{

    /*
    * Here the logic will be implemented so that different data type of collection in AirForce
    * can be traversed by same iterator.
    */

    List<IAircraft> jets;
    IAircraft[] helis;
    LinkedList<Boeing> cargo;
    int jetsIndex = 0;
    int helisIndex = 0;
    int cargoIndex = 0;
    AirForceIterator(AirForce airForce){
        jets = airForce.getJets();
        helis = airForce.getHelis();
        cargo = airForce.getCargo();
    }
    @Override
    public IAircraft next() {
        if (jetsIndex < jets.size())
            return jets.get(jetsIndex++);
        else if (helisIndex < helis.length)
            return helis[helisIndex++];
        else if(cargoIndex < cargo.size())
            return cargo.get(cargoIndex++);
        else
            throw new RuntimeException("No more aircraft data available");
    }

    @Override
    public boolean hasNext() {
        return ((jetsIndex < jets.size()) || (helisIndex < helis.length) || (cargoIndex < cargo.size()));
    }
}
