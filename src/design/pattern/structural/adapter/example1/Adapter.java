package src.design.pattern.structural.adapter.example1;

/*
* Adapter
*/
public class Adapter implements ICar {
    private HotAirBalloon hotAirBalloon;
    public Adapter(HotAirBalloon hotAirBalloon) {
        this.hotAirBalloon = hotAirBalloon;
    }
    @Override
    public void start() {
        String gasToBeUsed = hotAirBalloon.getGasUsed();
        hotAirBalloon.start(gasToBeUsed);
    }
}
