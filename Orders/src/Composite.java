import java.util.ArrayList;
import java.util.List;

public abstract class Composite {

    private String name;
    private Double value;

    private List<Composite> storeComponents;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getTotalValue() {
        Double total = this.value;

        for (Composite component: storeComponents) {
            total += component.getTotalValue();
        }

        return total;
}}
