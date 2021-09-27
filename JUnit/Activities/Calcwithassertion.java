package MathModule;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class Calcwithassertion {

	@Test
	public void addNumbers() {
	    Calculator calculator = new Calculator();
	    
	    // Assertion
	    assertEquals(3, calculator.add(1, 2)); // Passes
	    assertNotEquals(3, calculator.add(1, 2)); // Fails
	}
}