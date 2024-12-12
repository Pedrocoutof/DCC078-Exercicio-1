package org.example.singleton;

import org.example.bridge.PaymentMethod;

public class PaymentProcessor {
    private static PaymentProcessor instance;

    private PaymentProcessor() {}

    public static synchronized PaymentProcessor getInstance() {
        if (instance == null) {
            instance = new PaymentProcessor();
        }
        return instance;
    }

    public void process(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}