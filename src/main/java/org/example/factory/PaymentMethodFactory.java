package org.example.factory;
import org.example.bridge.PaymentMethod;

public abstract class PaymentMethodFactory {
    public abstract PaymentMethod createPaymentMethod(String type);
}