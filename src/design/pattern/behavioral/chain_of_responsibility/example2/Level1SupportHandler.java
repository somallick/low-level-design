package src.design.pattern.behavioral.chain_of_responsibility.example2;

public class Level1SupportHandler implements SupportHandler{
    private SupportHandler nextSupportHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.BASIC) {
            System.out.println("Level 1 support handle the request");
        } else if (nextSupportHandler != null) {
            nextSupportHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextSupportHandler = nextHandler;
    }
}
