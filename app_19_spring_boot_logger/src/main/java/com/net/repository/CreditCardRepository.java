package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.net.entity.CreditCardPayment;


@Repository
public interface CreditCardRepository extends JpaRepository<CreditCardPayment, String> {

}
