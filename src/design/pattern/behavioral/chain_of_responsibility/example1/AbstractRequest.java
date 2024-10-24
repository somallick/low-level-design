package src.design.pattern.behavioral.chain_of_responsibility.example1;

public class AbstractRequest {
    private int requestCode;

    public AbstractRequest(int requestCode) {
        this.requestCode = requestCode;
    }

    public int getRequestCode() {
        return requestCode;
    }
}
