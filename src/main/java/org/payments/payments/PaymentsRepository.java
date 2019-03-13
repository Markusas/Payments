package org.payments.payments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentsRepository extends JpaRepository<Payment, Integer> {


}
