public class Main {

    public static void main(String[] args) {
        Composite box = new Box("Encomenda completa", 0.25);
        box.addComponent(getSurpriseBox());

        System.out.println("Valor Total: " + box.getTotalValue());
    }

    public static Composite getSurpriseBox() {
        Composite balls = new Product("Bolinha", 2.50);
        Composite smartphone_case = new Product("Case", 15.50);

        Composite fish = new Product("Peixe", 22.50);
        Composite moto = new Product("Moto", 150.50);
        Composite mini_box = new Box("Mini Box", 15.50);
        mini_box.addComponent(fish);
        mini_box.addComponent(moto);

        Composite box = new Box("Encomenda completa", 0.25);
        box.addComponent(balls);
        box.addComponent(smartphone_case);
        box.addComponent(mini_box);

        return box;
    }
}
