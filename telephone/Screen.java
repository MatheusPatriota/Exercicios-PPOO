import java.util.ArrayList;
import java.util.List;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 * System.out.println("hello");
 */
public class Screen implements Observer {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
    }

    @Override
    public void showLastPressedNumber() {
        System.out.println("Pressionando: "+model.getLastDigit());
        System.out.println(model.getLastDigit());
    }

    @Override
    public void showAllPhoneNumber() {
        List<Integer> digits = model.getDigits();
        String result = "";
        for (int i = 0; i < digits.size() - 1; i++) {
            result += digits.get(i);
        }
        System.out.println("Agora discando: " + result);

    }
}
