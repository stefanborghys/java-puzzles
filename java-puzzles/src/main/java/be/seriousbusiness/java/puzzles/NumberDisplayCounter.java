package be.seriousbusiness.java.puzzles;

/**
 * Implementation of an exercise i was asked to write out on paper.</br>
 * 
 * Display a list of number from 1 to 100.</br>
 * Numbers divisible by 3 should display "boe",</br>
 * numbers divisible by 5 should display "bah",</br>
 * numbers divisible by 3 and 5 should display "boebah".</br>
 * In all other case the number is displayed.
 * @author seriousbusiness
 *
 */
public class NumberDisplayCounter {
	private static final int DIVISOR_THREE=3,DIVISOR_FIVE=5;
	private static final String PRINT_BOE="boe",PRINT_BAH="bah";
	
	/**
	 * Check if the remainder of a division is zero.
	 * @param dividend the number to divide 
	 * @param divisor the number to divide by
	 * @return <code>true</code> when the remainder is zero, otherwise <code>false</code>
	 */
	public static final boolean hasZeroRemainder(final int dividend,final int divisor){
		return dividend%divisor==0;
	}
	
	/**
	 * Print out all number from a starting number to an end number.</br>
	 * When the number is divisible by 3, "boe" is printed.</br>
	 * When the number is divisible by 5, "bah" is printed.</br>
	 * When the number is divisible by 3 and 5, "boebah" is printed.</br>
	 * In all other cases the number is printed.
	 * @param from the starting number
	 * @param to the end number
	 */
	public static final void displayCount(int from,final int to){
		for(; from<=to; from++){
			String s=String.valueOf(from);
			if(hasZeroRemainder(from,DIVISOR_THREE)){
				s=PRINT_BOE;
				if(hasZeroRemainder(from,DIVISOR_FIVE)){
					s+=PRINT_BAH;
				}
			}else if(hasZeroRemainder(from,DIVISOR_FIVE)){
				s=PRINT_BAH;
			}
			System.out.println(s);
		}
	}

}
