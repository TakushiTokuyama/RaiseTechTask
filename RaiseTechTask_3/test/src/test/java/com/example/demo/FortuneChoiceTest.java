package com.example.demo;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class FortuneChoiceTest {

	@Mock
	private UserInfo mockInfo = new UserInfo();

	@InjectMocks
	private FortuneChoice fc = new FortuneChoice();

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testMock() {

	when(mockInfo.getLank((Integer)anyInt())).thenReturn("一般会員");
	when(mockInfo.getSex((Integer)anyInt())).thenReturn("男");
	when(mockInfo.getName((Integer)anyInt())).thenReturn("mock");

	String result = fc.choice();

	String[] resultArray = result.split(",");

	String str1 = resultArray[0];
	String str2 = resultArray[1];
	String str3 = resultArray[2];

	assertEquals("一般会員の", str1);
	assertEquals("性別は男の", str2);
	assertEquals("mockさんの運勢は、", str3);


	}
}
