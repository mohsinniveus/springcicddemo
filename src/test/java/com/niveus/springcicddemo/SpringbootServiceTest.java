package com.niveus.springcicddemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.niveus.springcicddemo.controllers.MessageService;

@SpringBootTest
class SpringbootServiceTest {
  @Autowired
  private MessageService messageService;
  
   @Test
   @DisplayName("Subscription message service test ")
   void testSubscriptionMessage() {
     
    String user = "Peter";
     
      String message = messageService.getSubscriptionMessage(user);
      assertEquals("Hello "+user+", Thanks for the subscription!", message);
   }
}
