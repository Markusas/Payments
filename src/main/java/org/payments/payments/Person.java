package org.payments.payments;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String officialId;
    private String name;

     Person(String officialId, String name) {
        this.officialId = officialId;
        this.name = name;
    }

    public Person() {
    }
}
