package math;

//import junit.framework.Test;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

import junit.framework.TestSuite;

public class CalculatorTest {

	private Calculator calculator = new Calculator();
//	@Test
//	public void testMultiplyCorrect() {
//		Assert.assertEquals(calculator.multiply(2,3),6);
//	}
	
	  @Test
	    public void testAddValidIntegersAboveZero() {
	        assertEquals(4, add(2, 2)); // Expected outcome: 4
	    }

	    @Test
	    public void testAddValidIntegersZeroNonzero() {
	        assertEquals(2, add(0, 2)); // Expected outcome: 2
	    }

	    @Test
	    public void testAddNegativeIntegers() {
	        assertEquals(-3, add(-5, 2)); // Expected outcome: -3
	    }

	    @Test
	    public void testAddZeroAndNegative() {
	        assertEquals(-2, add(0, -2)); // Expected outcome: -2
	    }

	    @Test
	    public void testConcatValidStrings() {
	        assertEquals("HelloWorld", concat("Hello", "World")); // Expected outcome: "HelloWorld"
	    }

	    @Test
	    public void testConcatEmptyStrings() {
	        assertEquals("", concat("", "")); // Expected outcome: ""
	    }

	    @Test
	    public void testConcatStringAndNull() {
	        assertEquals("Hello", concat("Hello", null)); // Expected outcome: "Hello"
	    }

	    // Source functions to be tested

	    public int add(int a, int b) {
	        return a + b;
	    }

	    public String concat(String str1, String str2) {
	        if (str1 == null) {
	            str1 = "";
	        }
	        if (str2 == null) {
	            str2 = "";
	        }
	        return str1 + str2;
	    }
	
}
