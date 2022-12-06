public abstract class Decorator extends Cake{

    /**
     * following the decorator patter a design pattern that allows behavior
     * to be added to an individual object, dynamically, without affecting
     * the behavior of other objects from the same class. x
     */

    protected Cake cake;

    public Decorator(){
        this.cake = new Cake(){
            //insert functions we will use
            @Override
            public String getDescription() {
                return "";
            }
            @Override
            public int getCost() {
                return 0;
            }
        };
    }
//    default constructor
    public Decorator(Cake cake){
        this.cake = cake;
    }
}
