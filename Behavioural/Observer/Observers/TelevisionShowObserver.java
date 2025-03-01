package Behavioural.Observer.Observers;

public class TelevisionShowObserver implements Observer<String> {
    @Override
    public void update(String message) {
        System.out.println("Breaking news! " + message);
    }
}
