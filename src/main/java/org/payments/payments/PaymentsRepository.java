package org.payments.payments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentsRepository extends JpaRepository<Payment, Long> {

    @Query(value = "SELECT * FROM Person p WHERE p.officialId ", nativeQuery = true)
    List<Payment> findPaymentsByOfficialId(String officialId);

}
