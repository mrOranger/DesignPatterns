package Structural.Adapter;

public interface MobilePayment {
    void connect();
    void checkIdentityAndPay(String pin);
    void disconnect();
}
