package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	// Requirement 1 Start
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}	

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}	

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
		assertEquals(0, Calculator.add("0,0"));
		assertEquals(5, Calculator.add("2,3"));
	}	
	// Requirement 1 End


	// Requirement 2 
	@Test
	public void testUnkownNumberOfNumbers(){
		assertEquals(0, Calculator.add("0,0,0"));
		assertEquals(3, Calculator.add("1,1,1"));
		assertEquals(10, Calculator.add("1,2,3,4"));
	}

	// Requirement 3 

	@Test
	public void testNewLine() {
		assertEquals(10, Calculator.add("2\n3,5"));
		assertEquals(10, Calculator.add("2,3\n5"));
	}
	
	// Requirement 4
	@Test
	public void testDelimiter() {
		assertEquals(3, Calculator.add("//;\n1;2"));
	}

	
} 