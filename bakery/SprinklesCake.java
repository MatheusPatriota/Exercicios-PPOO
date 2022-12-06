public class SprinklesCake extends  Decorator{
    /**
     * Para granulado, adicione $2 e imprima "with sprinkles" no final do nome.
     */
    private final int PRICE =2;

    public SprinklesCake(){}
    public SprinklesCake(Cake cake){
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + "with sprinkles";
    }

    @Override
    public int getCost() {
        return cake.getCost() + PRICE;
    }
}
