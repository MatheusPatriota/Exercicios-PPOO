public class StrawberryCake extends Decorator{
    /**
     * Acrescente um novo tipo de bolo: bolo de morango (em inglês, strawberry cake), que
     * custa o dobro de um bolo padrão.
     */
    public StrawberryCake(){
        super();
    }
    public StrawberryCake(Cake cake){
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + "Strawberry cake";
    }

    @Override
    public int getCost() {
        return cake.getCost() + (super.getCost()*2);
    }
}
