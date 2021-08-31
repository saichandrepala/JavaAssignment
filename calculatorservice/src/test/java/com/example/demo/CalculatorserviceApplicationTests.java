package com.example.demo;

import com.calculator.service.calculatorservice.CalculatorService ;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorserviceApplicationTests {





        


   @Test
	public void testAdd() {
		int a = 15;
		int b = 21;
		int expectedResult = 35;
		


	}
	@Test
	public void testSub() {
		int a = 35;
		int b = 20;
		int expectedResult = 15;


	}
    @Test
	public void testMul() {
		int a = 35;
		int b = 20;
		int expectedResult = 750;


	}

	@Test
	public void testDiv() {
		int a = 35;
		int b = 5;
		int expectedResult = 7;


	}



}
