package src.solid.principle.interface_segregation;

public class GPay implements UpiPayment, CashBackManager{
    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println(this.getClass().getName() + ": Got cashback...");
    }

    @Override
    public void payMoney() {
        System.out.println(this.getClass().getName() + ": Paying money...");
    }

    @Override
    public void getScratchCard() {
        System.out.println(this.getClass().getName() + ": Got scratch card...");
    }
}
