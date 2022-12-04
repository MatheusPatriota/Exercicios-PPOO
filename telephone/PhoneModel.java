import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel implements Observable{
    private List<Integer> digits = new ArrayList<>();
    private List<Observer> observers = new ArrayList();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        this.publish();
    }

    public List<Integer> getDigits() {
        return digits;
    }


    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void publish() {
        for (Observer ob : observers) {
            System.out.println("Notificando observers!");
            ob.update(digits);
        }
    }
}
