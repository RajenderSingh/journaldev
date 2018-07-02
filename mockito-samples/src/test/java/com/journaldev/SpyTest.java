package com.journaldev;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class SpyTest {
	@Test
	public void testMethod() {
		List<String> list = new ArrayList<String>();
		List<String> listSpy = spy(list);
		         
		listSpy.add("first-element");
		System.out.println(listSpy.get(0));
		
		when(listSpy.get(0)).thenReturn("second-element");
		System.out.println(listSpy.get(0));

	}	

}
