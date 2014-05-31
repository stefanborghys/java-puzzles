package be.seriousbusiness.java.puzzles;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test implementation for PrimeNumber.
 * @author seriousbusiness
 * 
 */
public class PrimeNumberTest {
	
	@Test
	public void testIsPrimeNumber(){
		Assert.assertTrue(PrimeNumber.isPrimeNumber(2));
		Assert.assertTrue(PrimeNumber.isPrimeNumber(3));
		Assert.assertTrue(PrimeNumber.isPrimeNumber(5));
		Assert.assertTrue(PrimeNumber.isPrimeNumber(7));
		Assert.assertTrue(PrimeNumber.isPrimeNumber(11));
		Assert.assertTrue(PrimeNumber.isPrimeNumber(13));
		Assert.assertTrue(PrimeNumber.isPrimeNumber(17));
		Assert.assertTrue(PrimeNumber.isPrimeNumber(19));
		Assert.assertFalse(PrimeNumber.isPrimeNumber(1));
		Assert.assertFalse(PrimeNumber.isPrimeNumber(4));
		Assert.assertFalse(PrimeNumber.isPrimeNumber(6));
		Assert.assertFalse(PrimeNumber.isPrimeNumber(8));
		Assert.assertFalse(PrimeNumber.isPrimeNumber(9));
		Assert.assertFalse(PrimeNumber.isPrimeNumber(10));
		testNumberOfPrimeNumbers(1,120,30);
	}
	
	public void testNumberOfPrimeNumbers(int from,final int to,final int numberOfPrimeNumbers){
		int count=0;
		for(; from<=to; from++){
			if(PrimeNumber.isPrimeNumber(from)){
				count++;
				System.out.println(String.valueOf(from));
			}
		}
		Assert.assertEquals("The number of prime numbers between "+from+" and "+to+" is "+numberOfPrimeNumbers+".",numberOfPrimeNumbers,count);
	}

}
