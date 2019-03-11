package org.payments.payments;

import java.math.BigDecimal;

public class PaymentResponse {

    private Long id;
    private String name;
    private String officialId;
    private BigDecimal amount;

    public PaymentResponse(Long id, String name, String officialId, BigDecimal amount) {
        this.id = id;
        this.name = name;
        this.officialId = officialId;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOfficialId() {
        return officialId;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
