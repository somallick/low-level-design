package src.design.pattern.structural.flyweight.example2;

import java.util.*;

public class PatternMain {
    public static void main(String[] args) {
        Map<IAircraft,List<Double>> tejasAircraft = new HashMap<> (){{
            put(new Tejas(), Arrays.asList(10.0,10.0,20.0,20.0,5.0));
            put(new Tejas(), Arrays.asList(15.0,15.0,25.0,25.0,5.0));
            put(new Tejas(), Arrays.asList(20.0,30.0,40.0,60.0,10.0));
            put(new Tejas(), Arrays.asList(10.0,10.0,20.0,20.0,15.0));
        }};

        for(Map.Entry<IAircraft,List<Double>> tejasMap : tejasAircraft.entrySet()) {
            System.out.println("Time: " + tejasMap.getKey().getTotalTimeToReachDestination(
                    tejasMap.getValue().get(0), tejasMap.getValue().get(1), tejasMap.getValue().get(2),
                    tejasMap.getValue().get(3), tejasMap.getValue().get(4)
            ));
        }
    }
}
