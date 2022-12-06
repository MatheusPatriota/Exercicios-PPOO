import java.util.ArrayList;
import java.util.List;

/**
 * Digamos então que você precisa criar um sistema de pedidos que use essas classes. Os
 * pedidos podem conter produtos simples sem qualquer embalagens, bem como caixas
 * recheadas de produtos e outras caixas. Como você determinaria o preço total de um
 * pedido? Uma caixa poderia até adicionar algum custo extra ao preço final, como custo de
 * embalagem.
 * Usando o padrão Composite, modele (diagrama de classes), codifique e simule a situação
 * acima.
 */
public abstract class Composite {

    private String name;
    private Double value;

    private final List<Composite> storeComponents;

    public Composite(String name, Double value) {
        super();
        this.name = name;
        this.value = value;
        this.storeComponents = new ArrayList<Composite>();
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void addComponent(Composite component) {
        storeComponents.add(component);
    }

    public void removeComponent(Composite component) {
        storeComponents.remove(component);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTotalValue() {
        Double total = this.value;

        for (Composite component : storeComponents) {
            total += component.getTotalValue();
        }

        return total;
    }
}
