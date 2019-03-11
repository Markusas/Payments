package org.payments.payments;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Person {


    private Long id;
    @Id
    @GeneratedValue
    private String OfficialId;
    private String name;

     Person(String officialId, String name) {
        this.OfficialId = officialId;
        this.name = name;
    }

    public Person() {
    }
}
