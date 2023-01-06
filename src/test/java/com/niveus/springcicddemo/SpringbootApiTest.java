package com.niveus.springcicddemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpringbootApiTest {
  
  @Autowired
  private TestRestTemplate restTemplate;
   @Test
   @DisplayName("/hello rest api test ")
   void testMessage() {
     
     String user = "Peter";
     URI targetUrl= UriComponentsBuilder.fromUriString("/api/test/hello")                             
            .queryParam("user", user)                               
            .build()                                                
            .encode()                                               
            .toUri();
     
    String message = this.restTemplate.getForObject(targetUrl, String.class);
    assertEquals("Hello "+user+", Thanks for the subscription!", message);
   }
}