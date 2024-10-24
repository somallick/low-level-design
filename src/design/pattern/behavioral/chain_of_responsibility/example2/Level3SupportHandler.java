package src.design.pattern.behavioral.chain_of_responsibility.example2;

public class Level3SupportHandler implements SupportHandler{
    private SupportHandler nextSupportHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.CRITICAL) {
            System.out.println("Level 3 support handle the request");
        } else {
            System.out.println("Request cannot be handled.");
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextSupportHandler = nextHandler;
    }
}
