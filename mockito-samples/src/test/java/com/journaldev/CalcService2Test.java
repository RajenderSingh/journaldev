package com.journaldev;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalcService2Test {

  CalcService calcService;
	  
  @Mock
  AddService addService; 
	
  @Test
  public void testCalc() {
	System.out.println("**--- Test testCalc executed ---**");
	
	calcService = new CalcService(addService);
	
	int num1 = 11;
	int num2 = 12;
	int expected = 23;
	
	when(addService.add(num1, num2)).thenReturn(expected);
	
	int actual = calcService.calc(num1, num2);

	assertEquals(expected, actual);

  }
}
