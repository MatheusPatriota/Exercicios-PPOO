/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        /**
         * Altere o código cliente para adicionar o seguinte a uma Order (pedido) e imprima a
         * Order:
         * ○ Bolo de chocolate
         * ○ Bolo de baunilha com o dizer "PLAIN!"
         * ○ Bolo de baunilha com granulado com os dizeres "FANCY"
         * ○ Bolo de morango em várias camadas com granulado duplo e dois dizeres
         * "One of" e "EVERYTHING" (a saída esperada aqui é: Multi-layered
         * Strawberry cake with sprinkles with sprinkles with saying "One of" with saying
         * "EVERYTHING")
         */
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(new SayingCake(new VanillaCake(), "PLAIN!"));
        order.addCake(new SayingCake(new SprinklesCake(new VanillaCake()), "FANCY"));
        order.addCake(new SayingCake(new SayingCake(new SprinklesCake(new SprinklesCake(new StrawberryCake(new MultiLayeredCake()))), "One of"), "EVERYTHING"));

        // Print the order
        order.printOrder();
    }
}
