package org.example.bridge;

public class PaypalPlatform implements PaymentPlatform {
    @Override
    public void processPayment(double amount) {
        System.out.println("[PayPal] Processando pagamento de R$ " + amount);
    }
}