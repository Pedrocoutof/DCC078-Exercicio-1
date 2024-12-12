package org.example.bridge;

public class CreditCardPayment extends AbstractPaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Pagamento com Cartão de Crédito iniciado...");
        if (platform != null) {
            platform.processPayment(amount);
        } else {
            System.out.println("Nenhuma plataforma de pagamento configurada!");
        }
    }
}