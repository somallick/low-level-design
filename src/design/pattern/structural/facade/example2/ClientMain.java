package src.design.pattern.structural.facade.example2;

/*
* Consider an online banking system where users can perform various operations like checking account balances,
* transferring funds, and paying bills. The facade pattern can simplify the user interface by consolidating
* these operations into a single entry point.
*/
public class ClientMain {
    public static void main(String[] args) {
        BankingFacade bankingFacade = new BankingFacade();
        bankingFacade.getAccountDetails("778899");
        bankingFacade.transferFunds("778899", "112233", 1000.0);
        bankingFacade.payBill("778899", "BILL111", 5000.0);
    }
}
