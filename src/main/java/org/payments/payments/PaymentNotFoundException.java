package org.payments.payments;

public class PaymentNotFoundException extends RuntimeException {
    public PaymentNotFoundException(Integer id) {
        super ("Could not find payment " + id);
    }
}
