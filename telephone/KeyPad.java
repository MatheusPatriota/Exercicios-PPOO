import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Mimic the data input ability of a physical phone's keypad;
 * however, here we're just sending it fake digits.
 */
public class KeyPad implements Observable{
    private final PhoneModel model;
    private List<Observer> observers = new ArrayList();

    public KeyPad(PhoneModel model) {
        this.model = model;
    }

    public void simulateKeyPresses(int numKeyPresses) {
        final int MAX_DIGIT = 12;
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) {
            int newDigit = rnd.nextInt(MAX_DIGIT);
//            System.out.println("Pressing: " + newDigit);
            model.addDigit(newDigit);
            this.notificationAllObservers();
        }
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
    public void notificationAllObservers() {
        for (Observer ob : observers) {
            if(model.getDigits().size() >=12){
                ob.showAllPhoneNumber();
            }else{

            ob.showLastPressedNumber();
            }
        }
    }

}
