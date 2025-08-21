package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.net.entity.AmzaonDelivery;


@Repository
public interface AmzaonDeliverRepository extends JpaRepository<AmzaonDelivery, String> {

}
