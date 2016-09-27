package com.willcode4coffe.springaopsample;

import com.willcode4coffee.springaop.dto.Account;

public class BookingReservationInterceptorImpl  implements BookingReservationInterceptor {

	private Account interceptedaccount;
	
	public Account getAccountHolderDetails() {
			return interceptedaccount;
	}

	/**
	 * 
	 */
	public void interceptAccountHolderDetails(Account account) {
		System.out.println("**************************************");
		System.out.println("This method is invoked AFTER  the bookingReservation completed");
		this.interceptedaccount = account;
		if (interceptedaccount.getAccountType().equals("Gold")) {
			interceptedaccount.setPrice(0);
		}
		if (interceptedaccount.getAccountType().equals("Regular")) {
			interceptedaccount.setPrice(50);
		}
		System.out.println("**************************************");
	}
}

