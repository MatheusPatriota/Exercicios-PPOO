public class MultiLayeredCake extends Decorator {
    /**
     * Para bolos de várias camadas, adicione $5 e imprima "Multi-layered" na
     * frente do nome.
     */
    private final int PRICE =5;

    public MultiLayeredCake(){}

    @Override
    public String getDescription() {
        return "Multi-layered";
    }

    @Override
    public int getCost() {
        return cake.getCost() + PRICE;
    }
}
