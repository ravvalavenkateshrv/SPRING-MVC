package com.net.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.AccountDetails;
import com.net.entity.CreditCardPayment;
import com.net.repository.CreditCardRepository;

@Service
public class CreditCardService {
	
	@Autowired
	private CreditCardRepository creditCardRepository;
	
	
	public CreditCardPayment paymentViaCreditCart(CreditCardPayment creditCardPayment)
	{
		AccountDetails accountDetails=creditCardPayment.getAccountDetails();
		
		double totalAmount=accountDetails.getAvaibleBalance();
		
		double amountToBepaid=creditCardPayment.getAmounToBePaid();
		
		accountDetails.setAvaibleBalance(totalAmount-amountToBepaid);
		
		creditCardRepository.save(creditCardPayment);
		return creditCardPayment;
	}

}
