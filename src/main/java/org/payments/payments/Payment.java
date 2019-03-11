package org.payments.payments;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Entity
public class Payment {

    @OneToOne
    @JoinColumn(name = "personId")
    private Person person;
    @Id
    @GeneratedValue
    private Long id;
    private BigDecimal amount;
    private LocalDateTime date;

    public Person getPerson() {
        return person;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
