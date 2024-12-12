package org.example.bridge;

public class StripePlatform implements PaymentPlatform {
    @Override
    public void processPayment(double amount) {
        System.out.println("[Stripe] Processando pagamento de R$ " + amount);
    }
}