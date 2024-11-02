package src.design.pattern.behavioral.chain_of_responsibility.example2;

/*
* Imagine a customer support system where customer requests need to be handled based on their priority.
* There are three levels of support: Level 1, Level 2, and Level 3.
* Level 1 support handles basic requests, Level 2 support handles more complex requests,
* and Level 3 support handles critical issues that cannot be resolved by Level 1 or Level 2.
*/
public class ClientMain {
    public static void main(String[] args) {
        SupportHandler level3SupportHandler = new Level3SupportHandler();
        SupportHandler level2SupportHandler = new Level2SupportHandler();
        SupportHandler level1SupportHandler = new Level1SupportHandler();

        level1SupportHandler.setNextHandler(level2SupportHandler);
        level2SupportHandler.setNextHandler(level3SupportHandler);

        Request criticalRequest = new Request(Priority.CRITICAL);
        Request intermediateRequest = new Request(Priority.INTERMEDIATE);

        level1SupportHandler.handleRequest(criticalRequest);
        level1SupportHandler.handleRequest(intermediateRequest);

    }
}
