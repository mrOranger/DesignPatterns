package Structural.Adapter;

public class ApplePayment implements MobilePayment {
    private final String pin;
    private boolean isConnected;

    public ApplePayment(String pin) {
        this.pin = pin;
        this.isConnected = false;
    }

    public void connect() throws IllegalStateException {
        if(this.isConnected) {
            this.disconnect();
            throw new IllegalStateException("Already Connected");
        }

        this.isConnected = true;
        System.out.println("Connecting to Apple Pay...");
    }

    public void checkIdentityAndPay(String pin) throws IllegalStateException {
        if (!this.isConnected) {
            throw new IllegalStateException("Not connected to Apple Pay ");
        }

        if (!this.pin.equals(pin)) {
            this.disconnect();
            throw new IllegalStateException("Payment failed");
        }

        System.out.println("Payment successful!");
    }

    public void disconnect() throws IllegalStateException {
        if (!this.isConnected) {
            throw new IllegalStateException("Unable to disconnect to Apple Pay");
        }

        this.isConnected = false;
        System.out.println("Disconnecting from Apple Pay...");
    }
}
