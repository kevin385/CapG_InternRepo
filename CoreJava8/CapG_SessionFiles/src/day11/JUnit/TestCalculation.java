package day11.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestCalculation {
	Calculation c;
	@Test
	void test1() {
		assertTrue(true);
		assertEquals("hello", "hello");
		System.out.println("test1");
	}
	@Test
	void test2() {
		assertEquals(0, c.add(10, -2));
		System.out.println("test2");
	}
	@Test
	void test3() {
		assertTrue(c.nameTest("ankit"));
		assertFalse(c.nameTest("sam"));
		System.out.println("test3");
	}
	@Test
	void test4() {
		assertTrue(c.checkForPalindrome("madam"));
		System.out.println("test4");
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"madam","radar","naman"})
	void test5(String s1) {
		assertTrue(c.checkForPalindrome(s1));
		System.out.println("test5");
	}
	
	@AfterEach
	void testAfterEach() {
		System.out.println("after each");
	}
	
	@BeforeEach
	void testBeforeEach() {
		c = new Calculation();
		System.out.println("before each");
	}
}
