public class SayingCake extends Decorator{
    /**
     * Para um bolo com o dizer X, não adicione nada ao custo e imprima "with
     * saying 'X''" no final do nome.
     */
    private String saying;

    public SayingCake(String saying) {
        super();
        this.saying = saying;
    }

    public SayingCake(Cake cake, String saying) {
        super(cake);
        this.saying = saying;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + "with saying '" + this.saying + "' ";
    }

    @Override
    public int getCost() {
        return cake.getCost();
    }
}
