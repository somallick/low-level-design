package src.solid.principle.dependency_inversion;

public class Application {
    private Ilogger ilogger;

    public Application(Ilogger ilogger) {
        this.ilogger = ilogger;
    }

    public static void main(String[] args) {
        Application application = new Application(new FileLogger());
        application.ilogger.log("Logging for some file");

        application = new Application(new ConsoleLogger());
        application.ilogger.log("Logging in console");
    }
}
