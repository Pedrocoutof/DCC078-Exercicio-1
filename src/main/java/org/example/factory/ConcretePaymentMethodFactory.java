package org.example.factory;
import org.example.bridge.CreditCardPayment;
import org.example.bridge.PaymentMethod;
import org.example.bridge.PaypalPayment;


public class ConcretePaymentMethodFactory extends PaymentMethodFactory {

    @Override
    public PaymentMethod createPaymentMethod(String type) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment();
            case "paypal":
                return new PaypalPayment();
            default:
                throw new IllegalArgumentException("Tipo de pagamento desconhecido: " + type);
        }
    }
}