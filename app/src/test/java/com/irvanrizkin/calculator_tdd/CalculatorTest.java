package com.irvanrizkin.calculator_tdd;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  @Test
  public void whenToStringReturnInitialResult() {
    Calculator calculator = new Calculator();
    assertEquals("0.0", calculator.toString());
  }

  @Test
  public void whenAddNumbersReturnNumber() {
    Calculator calculator = new Calculator();
    calculator.add(5,2);
    assertEquals("7.0", calculator.toString());
  }

  @Test
  public void whenSubtractNumbersReturnNumber() {
    Calculator calculator = new Calculator();
    calculator.subtract(5,2);
    assertEquals("3.0", calculator.toString());
  }

  @Test
  public void whenMultiplyNumbersReturnNumber() {
    Calculator calculator = new Calculator();
    calculator.multiply(4,2);
    assertEquals("8.0", calculator.toString());
  }

  @Test
  public void whenDivisionNumbersReturnNumbers() {
    Calculator calculator = new Calculator();
    calculator.divide(4,2);
    assertEquals("2.0", calculator.toString());
  }

  @Test
  public void whenDivisionByZeroReturnZero() {
    Calculator calculator = new Calculator();
    calculator.divide(4,0);
    assertEquals("0.0", calculator.toString());
  }

  @Test
  public void whenCancelReturnZero() {
    Calculator calculator = new Calculator();
    calculator.cancel();
    assertEquals("0.0", calculator.toString());
  }
}
