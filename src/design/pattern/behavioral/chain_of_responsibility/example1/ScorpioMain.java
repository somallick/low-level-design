package src.design.pattern.behavioral.chain_of_responsibility.example1;

public class ScorpioMain {

    public static void main(String[] args) {
        // Create the Chain of responsibility
        AbstractHandler pressureHandler = new PressureIssueHandler(null);
        AbstractHandler engineHandler = new EngineIssueHandler(pressureHandler);
        AbstractHandler brakeHandler = new BrakeIssueHandler(engineHandler);

        // Create an issue that need to be handled
        PressureIssueRequest tyreIssue = new PressureIssueRequest();

        //Using brake handler so that request get delegate to pressure handler as it is a tyre puncture issue
        brakeHandler.handleRequest(tyreIssue);
    }
}

/*
* The request is sent by the client, who then forwards it to the chain’s first handler.
* Which handler will finally handle the request is unknown to the client.
*/
