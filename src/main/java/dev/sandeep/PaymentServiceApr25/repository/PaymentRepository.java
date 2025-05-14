package dev.sandeep.PaymentServiceApr25.repository;

import dev.sandeep.PaymentServiceApr25.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
