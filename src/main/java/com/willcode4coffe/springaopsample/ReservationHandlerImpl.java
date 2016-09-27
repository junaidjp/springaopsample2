package com.willcode4coffe.springaopsample;

import com.willcode4coffee.springaop.dto.Account;

public class ReservationHandlerImpl implements ReservationHandler {
	
	private Account account;
	
	public void bookReservation(Account account) { 
		System.out.println("**************************************");
		System.out.println("Account object is being set");
		System.out.println("**************************************");
		this.account = account;

		
		
	}
	
  public Account getAccount() { 

		return account;
	}
	
}