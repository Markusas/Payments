package org.payments.payments;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PaymentController {

    private final PaymentsRepository repository;

    public PaymentController(PaymentsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/payments")
    List<Payment> all() {

        return repository.findAll();
    }

    @GetMapping("/payments/{id}")
    Payment one(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new PaymentNotFoundException(id));
    }

    @PostMapping("/payments")
    Payment addPayment(@RequestBody Payment newPayment) {
        return repository.save(newPayment);
    }


}
