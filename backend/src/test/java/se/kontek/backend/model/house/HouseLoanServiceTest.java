package se.kontek.backend.model.house;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HouseLoanServiceTest {

  //values checked with https://www.calculator.net/loan-calculator.html
  @Autowired HouseLoanService service;

  @Test
  public void getFixedPlan() {
    String expected = "988.86";
    HouseLoanDto dto = new HouseLoanDto(100000, 10, 1,"fixed");
    String result = service.getPlan(dto);
    assertTrue(expected.equals(result));

  }

  @Test
  public void getVariablePlan() {
    String expected = "876.04";
    HouseLoanDto dto = new HouseLoanDto(100000, 10, 1,"variable");
    String result = service.getPlan(dto);
    assertTrue(expected.equals(result));

  }

  @Test
  public void getTestPlan() {
    String expected = "7557.45";
    HouseLoanDto dto = new HouseLoanDto(100000, 10, 3,"test");
    String result = service.getPlan(dto);
    System.out.println("result: " + result);
    assertTrue(expected.equals(result));

  }

}