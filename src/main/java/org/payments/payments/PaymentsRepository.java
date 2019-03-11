package org.payments.payments;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentsRepository extends JpaRepository<Payment, Long> {

    public List<Person> findPersonByOfficialId(String officialId);

}
