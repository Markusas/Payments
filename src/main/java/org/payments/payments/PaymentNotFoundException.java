package org.payments.payments;

public class PaymentNotFoundException extends RuntimeException {
    public PaymentNotFoundException(Long id) {
        super ("Could not find payment " + id);
    }
}
