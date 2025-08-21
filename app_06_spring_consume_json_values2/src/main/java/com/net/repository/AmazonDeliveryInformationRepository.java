package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.net.entity.AmazonDeliveryInformation;


@Repository
public interface AmazonDeliveryInformationRepository extends JpaRepository<AmazonDeliveryInformation,String>{

}
