/* SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 5: 5 
       Yes, I used appropriate CONSTANTS throughout the code.
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE?
       Mark out of 5: 5
       Yes, i used easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE.
   3. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)?
       Mark out of 10: 10
       Yes I used easy-to-understand meaningful variable names
   4. Did I indent the code appropriately?
       Mark out of 10: 10
       Yes, I indented the code appropriately
   5. Did I use an appropriate loop (or loops) to produce the different verses?
       Mark out of 20: 20
      Yes, I used an appropriate loop to produce the different verses
   6. Did I use a switch to build up the verses?
       Mark out of 25: 25
       Yes, I used a switch to build up the verses
   7. Did I avoid duplication of code and of the lines which make up the verses (each line should be referred to in the code only once (or twice))?
       Mark out of 10: 10
        Yes, I avoided duplication of code and of the lines which make up the verses
   8. Does the program produce the correct output?
       Mark out of 10: 10
       Yes, the program produced the correct output
   9. How well did I complete this self-assessment?
       Mark out of 5: 5
   Total Mark out of 100 (Add all the previous marks): 100
*/
public class Christmas12 {

	public static final String VERSE_ONE = "A Patridge in a pear tree";
	public static final String VERSE_TWO = "Two Turtle Doves\n";
	public static final String VERSE_THREE = "Three French Hens\n";  	 		
	public static final String VERSE_FOUR = "Four Calling Birds\n"; 
	public static final String VERSE_FIVE = "Five Golden Rings\n";
	public static final String VERSE_SIX = "Six Geese a Laying\n";
	public static final String VERSE_SEVEN = "Seven Swans a Swimming\n";
	public static final String VERSE_EIGHT = "Eight Maids a Milking\n";
	public static final String VERSE_NINE = "Nine Ladies Waiting\n";
	public static final String VERSE_TEN =  "10 Lords a Leaping\n";
	public static final String VERSE_ELEVEN = "'leven Pipers Piping\n";
	public static final String VERSE_TWELVE = "12 Drummers Drumming\n";
	public static final String SECOND_LINE = "My true love gave to me:\n";
	public static final String FIRST_WORDS = "On the ";
	public static final String SECOND_WORDS = " day of Christmas\n";
	public static final int NUMBER_OF_DAYS = 12; 

	public static void main(String[] args) {
		String song = "";
		String dayCount = "";

		for (int day = 1; day <= NUMBER_OF_DAYS; day++) {
			switch (day) {
			case 1: 
				dayCount = " first";
				song = VERSE_ONE; 
				break;
			case 2:
				dayCount = " second";
				song = VERSE_TWO + song;
				break;
			case 3:
				dayCount = " third";
				song = VERSE_THREE + song;
				break;
			case 4:
				dayCount = " fourth";
				song = VERSE_FOUR + song;
				break;
			case 5:
				dayCount = " fifth";
				song = VERSE_FIVE + song;
				break;
			case 6:
				dayCount = " sixth";
				song = VERSE_SIX + song;
				break;
			case 7:
				dayCount = " seventh";
				song = VERSE_SEVEN + song;
				break;
			case 8:
				dayCount = " eighth";
				song = VERSE_EIGHT + song;
				break;
			case 9:
				dayCount = " ninth";
				song = VERSE_NINE + song;
				break;
			case 10:
				dayCount = " tenth";
				song = VERSE_TEN + song;
				break;
			case 11:
				dayCount = " eleventh";
				song = VERSE_ELEVEN + song;
				break;
			case 12:
				dayCount = " twelfth";
				song = VERSE_TWELVE + song;
				break;

			}
			System.out.println(FIRST_WORDS + dayCount + SECOND_WORDS + SECOND_LINE + song);
		}




	}



}
