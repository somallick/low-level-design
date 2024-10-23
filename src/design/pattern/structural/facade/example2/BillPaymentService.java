package src.design.pattern.structural.facade.example2;

public class BillPaymentService {
    public void payBill(String accountId, String billId, double amount) {
        System.out.println("Paying bill " + billId + " from account " + accountId + " with amount " + amount);
    }
}
