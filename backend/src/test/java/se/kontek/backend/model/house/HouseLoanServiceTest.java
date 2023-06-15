package se.kontek.backend.model.house;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HouseLoanServiceTest {

  @Autowired HouseLoanService service;

  @Test
  public void getFixedPlan() {
    String expected = "1321.51";

    HouseLoanDto dto = new HouseLoanDto(100000, 10, 1,"fixed");

    String result = service.getPlan(dto);
    System.out.println("result: " + result);
    assertTrue(expected.equals(result));

  }

  @Test
  public void getVariablePlan() {
    String expected = "1.0";

    HouseLoanDto dto = new HouseLoanDto(100000, 10, 1,"variable");

    String result = service.getPlan(dto);
    System.out.println("result: " + result);
    assertTrue(expected.equals(result));

  }

}