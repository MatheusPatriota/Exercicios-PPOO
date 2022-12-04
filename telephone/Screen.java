/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen implements ScreenObservable{
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
    }


    @Override
    public void subscribe(Observer observer) {

    }

    @Override
    public void unsubscribe(Observer observer) {

    }

    @Override
    public void publish() {

    }
}
