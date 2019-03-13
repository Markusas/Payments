package org.payments.payments;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
    public Person(int id, String officialId, String name) {
        this.id = id;
        this.officialId = officialId;
        this.name = name;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public String getOfficialId() {
        return officialId;
    }

    public String getName() {
        return name;
    }

    @Id
    @GeneratedValue
    private int id;
    private String officialId;
    private String name;

}

