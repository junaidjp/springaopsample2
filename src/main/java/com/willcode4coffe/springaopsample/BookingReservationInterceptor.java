package com.willcode4coffe.springaopsample;

import com.willcode4coffee.springaop.dto.Account;

public interface BookingReservationInterceptor {
	
	void interceptAccountHolderDetails(Account account);

	Account getAccountHolderDetails();

}
