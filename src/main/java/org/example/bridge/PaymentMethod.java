package org.example.bridge;

public interface PaymentMethod {
    void pay(double amount);
    void setPlatform(PaymentPlatform platform);
}