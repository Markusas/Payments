package org.payments.payments;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Payment {

    @Id
    @GeneratedValue
    private int paymentId;
    private int personId;
    private BigDecimal amount;
    private LocalDateTime date;

    public Payment(int personId, int paymentId, BigDecimal amount, LocalDateTime date) {
        this.personId = personId;
        this.paymentId = paymentId;
        this.amount = amount;
        this.date = date;
    }

    public int getPersonId() {
        return personId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public Payment() {
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getDate() {
        return date;
    }
}

