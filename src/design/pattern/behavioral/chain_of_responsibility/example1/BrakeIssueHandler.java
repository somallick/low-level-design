package src.design.pattern.behavioral.chain_of_responsibility.example1;

//Concrete Handlers
public class BrakeIssueHandler extends AbstractHandler {
    public static final int handleCode = 301;

    public BrakeIssueHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if(request.getRequestCode() == handleCode) {
            System.out.println("Brake Handler is handling the request");
        }
        else {
            super.handleRequest(request);
        }
    }
}
