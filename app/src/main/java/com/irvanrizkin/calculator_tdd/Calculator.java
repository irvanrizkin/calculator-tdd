package com.irvanrizkin.calculator_tdd;

public class Calculator {
  double result = 0;
  @Override
  public String toString() {
    return String.valueOf(result);
  }

  public void add(int a, int b){
    result = a + b;
  }

  public void subtract(int a, int b){
    result = a - b;
  }

  public void multiply(int a, int b){
    result = a * b;
  }
}
