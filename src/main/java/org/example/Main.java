package org.example;
import org.example.bridge.*;
import org.example.factory.*;
import org.example.singleton.*;

public class Main {
    public static void main(String[] args) {
        PaymentMethodFactory factory = new ConcretePaymentMethodFactory();

        PaymentMethod creditCardPayment = factory.createPaymentMethod("creditcard");

        PaymentMethod paypalPayment = factory.createPaymentMethod("paypal");

        PaymentPlatform stripePlatform = new StripePlatform();
        PaymentPlatform paypalPlatform = new PaypalPlatform();

        creditCardPayment.setPlatform(stripePlatform);
        paypalPayment.setPlatform(paypalPlatform);

        PaymentProcessor processor = PaymentProcessor.getInstance();

        processor.process(creditCardPayment, 150.00);
        processor.process(paypalPayment, 75.50);
    }
}
