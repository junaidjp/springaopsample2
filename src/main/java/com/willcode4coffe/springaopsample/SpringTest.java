package com.willcode4coffe.springaopsample;




import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.willcode4coffee.springaop.dto.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("applicationContext-aop.xml")
public class SpringTest {
  
@Autowired
 ApplicationContext context;

  @Autowired
  BookingReservationInterceptor bookingReservationInterceptor;

  @Autowired
  ReservationHandler reservationHandler;

  
  @Test
  public void bookingInterceptorShouldgiveusPrice() {
     Account account  = new Account();
     account.setAccountType("Regular");
     account.setName("Sharon");
    // System.out.println("The interceptor will provide the price for this Account");
	 reservationHandler.bookReservation(account);
	 System.out.println("The interceptor set the price "
+ bookingReservationInterceptor.getAccountHolderDetails().getPrice());

   
  }

}
