package src.design.pattern.behavioral.iterator.example1;

public class Boeing implements IAircraft{
    @Override
    public void getDetails() {
        System.out.println("Hey Captain, this is Cargo Boeing reporting");
    }
}