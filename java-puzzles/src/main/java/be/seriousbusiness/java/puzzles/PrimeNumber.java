package be.seriousbusiness.java.puzzles;

/**
 * Implementation to determine if a number is a prime number or not.
 * @author seriousbusiness
 *
 */
public class PrimeNumber {
	
	/**
	 * Check if the remainder of a division is zero.
	 * @param dividend the number to divide 
	 * @param divisor the number to divide by
	 * @return <code>true</code> when the remainder is zero, otherwise <code>false</code>
	 */
	private static final boolean hasZeroRemainder(final int dividend,final int divisor){
		return dividend%divisor==0;
	}
	
	/**
	 * Check if a number is a prime number.</br>
	 * A prime number has to be greater than 1</br>
	 * and only dividible by 1 and itself.
	 * @param number
	 * @return <code>true</code> when the number is a prime number, otherwise <code>false</code>
	 */
	public static final boolean isPrimeNumber(final int number){
		if(number>1 && hasZeroRemainder(number,1) && hasZeroRemainder(number,number)){
			for(int i=2; i<number; i++){
				if(hasZeroRemainder(number,i)){
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
