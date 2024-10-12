package src.solid.principle.interface_segregation;

public class PaymentMain {

    public static void main(String[] args) {

        GPay gPay = new GPay();
        gPay.payMoney();
        gPay.getCashBackAsCreditBalance();

    }
}
