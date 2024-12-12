package org.example.bridge;

public abstract class AbstractPaymentMethod implements PaymentMethod {
    protected PaymentPlatform platform;

    @Override
    public void setPlatform(PaymentPlatform platform) {
        this.platform = platform;
    }
}