package com.journaldev;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;

public class VerifyInteractionTest {
	@Test
	public void testMethod() {
		List<String> mockedList = Mockito.mock(List.class);

		mockedList.add("first-element");
		mockedList.add("second-element");
		mockedList.clear();

		verify(mockedList).add("first-element");
		verify(mockedList).add("second-element");
		verify(mockedList).clear();
	}	

}
