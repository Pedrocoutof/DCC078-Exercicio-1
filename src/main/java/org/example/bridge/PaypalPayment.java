package org.example.bridge;

public class PaypalPayment extends AbstractPaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Pagamento com PayPal (método interno) iniciado...");
        if (platform != null) {
            platform.processPayment(amount);
        } else {
            System.out.println("Nenhuma plataforma de pagamento configurada!");
        }
    }
}