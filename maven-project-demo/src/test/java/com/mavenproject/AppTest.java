package com.mavenproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

//	@Test
//	void test() {
//		//fail("Not yet implemented");
//	}
	@Test
	void testAddition() {
		App app = new App();
		int result = app.add(5, 2);
		assertEquals(7, result);
	}

}
