package src.design.pattern.behavioral.chain_of_responsibility.example2;

public class Level2SupportHandler implements SupportHandler{
    private SupportHandler nextSupportHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.INTERMEDIATE) {
            System.out.println("Level 2 support handle the request");
        } else if (nextSupportHandler != null) {
            nextSupportHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextSupportHandler = nextHandler;
    }
}
