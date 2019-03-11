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
    List<PaymentResponse> all(){
        List<PaymentResponse> result = new ArrayList<>();
        repository.findAll().forEach(
                payment -> result.add(new PaymentResponse(payment.getId(), payment.getPerson().getName(), payment.getPerson().getOfficialId(), payment.getAmount()))
        );
        return result;
    }

    @GetMapping("/payments/{id}")
    PaymentResponse one(@PathVariable Long id){
        Payment payment = repository.findById(id)
                .orElseThrow(() -> new PaymentNotFoundException(id));
        return new PaymentResponse(payment.getId(), payment.getPerson().getName(), payment.getPerson().getOfficialId(), payment.getAmount());
    }

    @PostMapping("/payments")
    Payment addPayment(@RequestBody Payment newPayment){
        return repository.save(newPayment);
    }


}
