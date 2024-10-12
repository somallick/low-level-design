package src.solid.principle.dependency_inversion;

public class FileLogger implements Ilogger{
    @Override
    public void log(String message) {
        System.out.println(this.getClass().getName() + ": " + message);
    }
}
