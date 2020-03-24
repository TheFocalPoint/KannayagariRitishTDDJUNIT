package com.epam.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class RemoveFirst2A {
	RemoveAFirst2 removeafirst2;
	
	@BeforeEach
	void setUp()
	{
		 removeafirst2 = new RemoveAFirst2();
	}
@Test
void taskTest1()
{
	
	assertEquals("BCD",removeafirst2.remove("ABCD"));
}
@Test
void taskTest2()
{
	assertEquals("CD",removeafirst2.remove("AACD"));
}
@Test
void tastTest3()
{
	assertEquals("BCD",removeafirst2.remove("BACD"));
}
void taskTest4()
{
	assertEquals("BBAA",removeafirst2.remove("BBAA"));
}
void taskTest5()
{
	assertEquals("BAA",removeafirst2.remove("AABAA"));
}

}

