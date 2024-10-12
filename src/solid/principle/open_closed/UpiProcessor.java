package src.solid.principle.open_closed;

public class UpiProcessor implements PaymentProcessor{
    @Override
    public void pay(Order order, String securityCode) {
        System.out.println("Processing upi payment type");
        System.out.println("Verifying security code: " + securityCode);
        order.setStatus("paid");
    }
}
