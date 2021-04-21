/* SELF ASSESSMENT 
   1.  createSequence:
Did I use the correct method definition?
Mark out of 5: 4
Comment: I used mostly the correct method definition
Did I create an array of size n (passed as the parameter) and initialise it?
Mark out of 5: 5
Comment: Yes i did make an array and initialise it
Did I return the correct item?
Mark out of 5: 2
Comment: I did not return the fully correct item
   2.  crossOutMultiples
Did I use the correct method definition?
Mark out of 5: 5
Comment:Yes i used the correct method definition
Did I ensure the parameters are not null and one of them is a valid index into the array
Mark out of 2: 2
Comment: I did make sure the paramters are not null
Did I loop through the array using the correct multiple?
Mark out of 5: 5
Comment: Yes i looped through the array
Did I cross out correct items in the array that were not already crossed out?
Mark out of 3: 1
Comment: No I did not cross out correct items
   3.  sieve   
Did I have the correct function definition?
Mark out of 5: 5
Comment:Yes i had the correct function definition
Did I make calls to other methods?
Mark out of 5: 2
Comment:     I did not make reference
Did I return an array with all non-prime numbers are crossed out?
Mark out of 2: 0
Comment: No i did not return an array with all non prime numbers
   4.  sequenceTostring  
Did I have the correct function definition?
Mark out of 5: 5
Comment: Yes i had the correct function definition
Did I ensure the parameter to be used is not null?
Mark out of 3: 3
Comment: I ensured the parameter was not null
Did I Loop through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets? 
Mark out of 10: 5
Comment:    I did not do it correctly
   5.  nonCrossedOutSubseqToString  
Did I have the correct function definition
Mark out of 5: 5
Comment:        Yes i had the correct function definition
Did I ensure the parameter to be used is not null?  
Mark out of 3: 3
Comment: Yes i ensured the parameter to be used is not null
Did I loop through the array updating the String variable with just the non-crossed out numbers? 
Mark out of 5: 0 
Comment: I did not do this accuratley
   6.  main  
Did I ask  the user for input n and handles input errors?  
Mark out of 5: 2
Comments: I askednthe user for input i dod not handle errors
Did I make calls to other methods (at least one)?
Mark out of 5: 5
Comment:  Yes i made calls to other methods
Did I print the output as shown in the question?  
Mark out of 5: 2
Comment:  No I did not print the correct output
   7.  Overall
Is my code indented correctly?
Mark out of 4: 4
Comments:yes it is indented correctly
Do my variable names make sense?
Mark out of 4: 3
Comments: Yes they mainly make sense
Do my variable names, method names and class name follow the Java coding standard
Mark out of 4: 4
Comments:Yes they do follow Java coding standards
      Total Mark out of 100 (Add all the previous marks): 72
*/
import java.util.Scanner;

public class SieveOfEratothenes {

	public static final String NQuestion = "Please enter a positive integer with value of at least 2.";
	public static int[] sieveArray;
	public static int [] numbers;
	public static void main(String[] args) {

		Scanner arrayInput = new Scanner(System.in);
		int numberArray = 0;
		System.out.println(NQuestion);
		numberArray = arrayInput.nextInt();
		sieveArray =  new int[numberArray-1];

		sieveArray  = new int[numberArray-1];
		numbers = new int [numberArray-1];
		createSequence(sieveArray);
		sieve(sieveArray, numbers);
		String lastSequence = "";
		for (int count = 2; count < numberArray; count++) { 
			crossOutHigherMultiples(sieveArray, count);
			if (sieveArray[count-2] == 1) {
				if (lastSequence.equals(sequenceToString(sieveArray, numbers))) {
					count = numberArray;
				}
				else {
					System.out.println(sequenceToString(sieveArray, numbers));
					lastSequence = sequenceToString(sieveArray, numbers);
				}
			}
		}
		sieve(sieveArray, numbers);
		arrayInput.close();
	}
	public static void createSequence(int sieveArray [])
	{
		for(int count = 0; count < sieveArray.length; count++) {
			sieveArray[count] = 1;
		}
	}

	public static void crossOutHigherMultiples(int sieveArray [], int numberArray)
	{
		for(int count = numberArray - 2 + numberArray; count < sieveArray.length; count++) {
			sieveArray[count] = 0;
		}

	}

	public static void sieve(int sieveArray [], int numbers [])
	{
		for(int count = 0; count < sieveArray.length; count++) {
			if(sieveArray[count] == 0) {
				
				numbers [count] =0;
			}
			else { 
				numbers[count] = count+2;

			}

		}
		System.out.println(nonCrossedOutSubseqToString(numbers));
	}

	public static String sequenceToString(int sieveArray [], int numbers [])
	{
		String sequenceOne = "";
		for(int count = 0; count < sieveArray.length; count++) {
			if(sieveArray[count]==0) {
				sequenceOne += "[" + (count+2) + "], ";
			}
			else {
				sequenceOne += numbers[count] + ", ";
			}
		}

		return sequenceOne;
	}

	public static String nonCrossedOutSubseqToString(int numbers [])
	{
		String sequence = "";
		for(int count = 0; count < numbers.length; count++) {
			if(numbers[count]!=0) {
				if(count == 0) {
					sequence += numbers[count];	
				}
				else {
					sequence += ", " + numbers[count];
				}
			}

		}

		return sequence;
	}

}