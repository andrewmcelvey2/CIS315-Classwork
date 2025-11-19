package wed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	// 1. write test first (fail)
	// 2. write code (green)
	// 3. regression testing... (keep the bar green)
	
	public void testAdd() throws Exception {
		Calculator calc = new Calculator();
		int result = calc.add(2, 3);
		assertEquals(5, result);
	}
	
	public void testSubtract() throws Exception {
		Calculator calc = new Calculator();
		int result = calc.subtract(2, 3);
		assertEquals(-1, result);
	}

}
