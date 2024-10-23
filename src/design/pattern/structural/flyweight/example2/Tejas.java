package src.design.pattern.structural.flyweight.example2;

public class Tejas implements IAircraft{

    //Intrinsic Property
    private final String name = "Tejas";
    private final int seater = 2;
    private final String dimensions = "15m by 4m";
    private final String wingSpan = "40 feet";

    public String getName() { return name; }
    public int getSeater() { return seater; }
    public String getDimensions() { return dimensions; }
    public String getWingSpan() { return wingSpan; }

    //Extrinsic Property
    @Override
    public double getTotalTimeToReachDestination(double srcX, double srcY, double desX, double desY, double speed){
        return (Math.sqrt(Math.pow((desX - srcX), 2) + Math.pow((desY - srcY), 2)))/speed;
    }
}
