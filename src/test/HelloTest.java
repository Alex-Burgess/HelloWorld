package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Hello;

class HelloTest {
	@Test
	public void testHello() {
	    Hello testHello = new Hello();
	    assertEquals("Mickey Mouse", testHello.createName("Mickey", "Mouse"), "Name was not Mickey Mouse");
	}
}
