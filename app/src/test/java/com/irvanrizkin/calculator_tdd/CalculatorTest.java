package com.irvanrizkin.calculator_tdd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  @Test
  public void whenToStringReturnInitialResult(){
    Calculator calculator = new Calculator();
    assertEquals("0.0",calculator.toString());
  }
}
