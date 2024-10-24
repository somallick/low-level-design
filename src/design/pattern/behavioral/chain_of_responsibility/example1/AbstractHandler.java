package src.design.pattern.behavioral.chain_of_responsibility.example1;

//Handler Interface or Abstract Class
public abstract class AbstractHandler {
    private AbstractHandler nextHandler;

    public AbstractHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(AbstractRequest request) {
        if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
