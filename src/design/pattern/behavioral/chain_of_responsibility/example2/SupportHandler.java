package src.design.pattern.behavioral.chain_of_responsibility.example2;

public interface SupportHandler {
    void handleRequest(Request request);
    void setNextHandler(SupportHandler nextHandler);
}
