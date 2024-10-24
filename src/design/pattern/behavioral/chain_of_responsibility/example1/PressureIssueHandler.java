package src.design.pattern.behavioral.chain_of_responsibility.example1;

//Concrete Handlers
public class PressureIssueHandler extends AbstractHandler {
    public static final int handleCode = 303;

    public PressureIssueHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if(request.getRequestCode() == handleCode) {
            System.out.println("Pressure Handler is handling the request");
        }
        else {
            super.handleRequest(request);
        }
    }
}
