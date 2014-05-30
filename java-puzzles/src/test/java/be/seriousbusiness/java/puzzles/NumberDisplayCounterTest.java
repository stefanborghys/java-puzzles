package be.seriousbusiness.java.puzzles;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test implementation for NumberDisplayCounter.
 * @author seriousbusiness
 */
public class NumberDisplayCounterTest {
	
	@Test
	public void testHasZeroRemainder(){
		Assert.assertFalse(NumberDisplayCounter.hasZeroRemainder(5,3));
		Assert.assertFalse(NumberDisplayCounter.hasZeroRemainder(12,5));
		Assert.assertTrue(NumberDisplayCounter.hasZeroRemainder(3,3));
		Assert.assertTrue(NumberDisplayCounter.hasZeroRemainder(10,5));
		Assert.assertTrue(NumberDisplayCounter.hasZeroRemainder(5,5));
		Assert.assertTrue(NumberDisplayCounter.hasZeroRemainder(25,5));
	}
	
	@Test
	public void testDisplayCount(){
		NumberDisplayCounter.displayCount(1,100);
	}

}
