package simpleJunitTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator c=null;
	
	@Before
	public void setup()
	{
		c=new Calculator();
	}

	@Test
	public void test() {
		assertEquals(15,c.add(5, 10));
	}

}
