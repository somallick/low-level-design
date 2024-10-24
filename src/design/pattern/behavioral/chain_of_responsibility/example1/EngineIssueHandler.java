package src.design.pattern.behavioral.chain_of_responsibility.example1;

//Concrete Handlers
public class EngineIssueHandler extends AbstractHandler {
    public static final int handleCode = 302;

    public EngineIssueHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if(request.getRequestCode() == handleCode) {
            System.out.println("Engine Handler is handling the request");
        }
        else {
            super.handleRequest(request);
        }
    }
}