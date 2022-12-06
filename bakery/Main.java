/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(new SayingCake(new VanillaCake(), "PLAIN!"));
        order.addCake(new SayingCake(new SprinklesCake(new VanillaCake()), "FANCY"));
        order.addCake(new SayingCake(new SayingCake(new SprinklesCake(new SprinklesCake(new StrawberryCake(new MultiLayeredCake()))), "One of"), "EVERYTHING"));

        // Print the order
        order.printOrder();
    }
}
