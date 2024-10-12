package src.design.pattern.structural.adapter.example1;

public class ClientMain {
    public static void main(String[] args) {
        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        ICar adapter = new Adapter(hotAirBalloon);
        adapter.start();
    }
}
