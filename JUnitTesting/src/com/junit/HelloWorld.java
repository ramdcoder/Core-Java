package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorld {

	@Test
	void test() {
		//fail("Not yet implemented");
		System.out.println("Hello world");
		String str = "hello world";
		assertEquals("Hello world", str);
		
	}

}
