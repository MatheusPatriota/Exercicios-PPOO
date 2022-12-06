public class Box extends Composite {
    /**
     * Uma caixa pode conter
     * vários Produtos, bem como uma série de caixas menores. Essas pequenas caixas também
     * podem conter alguns produtos ou até outras caixas menores, e assim por diante.
     */
    public Box(String name, Double value){
        super(name, value);
    }
}
