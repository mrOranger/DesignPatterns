package Structural.Adapter.Legacy;

public interface LegacyPayment {
    void authenticate(String pin);
    void pay();
}
