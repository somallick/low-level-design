package src.design.pattern.behavioral.visitor.example1;

/*
* A Shopping cart where we can add different type of items (Elements).
* When we click on checkout button, it calculates the total amount to be paid.
* Now we can have the calculation logic in item classes, or we can move out this logic to another class
*/
public class ShoppingCartClient {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(20, "1234"),new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(ItemElement item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}
