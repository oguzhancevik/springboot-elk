package io.github.oguzhancevik.elkdemo;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ElkController {

  private final Logger LOGGER = Logger.getLogger(this.getClass().getName());

  @Autowired
  RestTemplate restTemplate;

  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @RequestMapping(value = "/elk")
  public String helloWorld() {
    String response = "Hello World " + new Date();
    LOGGER.log(Level.INFO, response);
    return response;
  }

  @RequestMapping(value = "/exception")
  public String exception() {
    String response = null;
    try {
      throw new Exception("Exception has occured...");
    } catch (Exception e) {
      e.printStackTrace();
      LOGGER.throwing(getClass().getEnclosingMethod().getName(), getClass().getName(), e);
      LOGGER.log(Level.INFO, e.getMessage());
      response = e.getMessage();
    }
    return response;
  }


}
