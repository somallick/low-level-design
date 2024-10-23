package src.design.pattern.structural.facade.example2;

public class TransferService {
    public void transferFunds(String fromAccount, String toAccount, double amount) {
        System.out.println("Transferring " + amount + " from account " + fromAccount + " to account " + toAccount);
    }
}
