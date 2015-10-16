package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

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

	@Test
	public void testUnkownNumberOfNumbers(){
		assertEquals(0, Calculator.add("0,0,0"));
		assertEquals(3, Calculator.add("1,1,1"));
		assertEquals(10, Calculator.add("1,2,3,4"));
	}
} 