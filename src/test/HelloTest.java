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
	
	@Test
	public void myFirstExceptionTest() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			throw new IllegalArgumentException("my first exception");
		});
		
		assertEquals("my first exception", exception.getMessage());
	}
	
	@Test
	public void testNumberLessThanNine() throws Exception {
		Hello testHello = new Hello();

		assertEquals("Value is good.", testHello.numberLessThanNine(5));
	}
	
	@Test
	public void testNumberGreaterThanNine() {
		Hello testHello = new Hello();
		
		Exception exception = assertThrows(Exception.class, () -> {
			testHello.numberLessThanNine(10);
		});
			
		
		assertEquals(exception.getMessage(), "Value is not less than nine." );
	}
}
