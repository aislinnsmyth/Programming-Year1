/*   1. Did I use appropriate easy-to-understand, meaningful variables and CONSTANTS within the code? 
       Mark out of 10: 7
       Comment:
   2. Did I format the variable and CONSTANT names appropriate (in lowerCamelCase and UPPERCASE)?
       Mark out of 5: 8
       Comment:
   3. Did I generate the computer's choice in each game correctly using a Random number generator?
       Mark out of 10: 10
       Comment:
   4. Did I input the user's choice in each game correctly?
       Mark out of 10: 8
       Comment:
   5. Did I correctly compare the choices and update the score appropriately?
       Mark out of 20: 17
       Comment:
   6. Did I inform the user of who won each game (and why) correctly?
       Mark out of 10: 8
       Comment:
   7. Did I use an appropriate for loop to allow the player to play 5 games?  There should be only one loop.
       Mark out of 20: 20
       Comment:
   8. Did I output the final scores correctly after the 5 games were played. 
       Mark out of 10: 7
       Comment:
   9. How well did I complete this self-assessment?
       Mark out of 5: 3
       Comment:
   Total Mark out of 100 (Add all the previous marks): 88
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static final int GAMES_ALLOWED = 5;
	public static final int MAXIMUM_NUMBER = 3;
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;


	public static void main(String[] args) {
		Scanner gameInput = new Scanner(System.in);

		int computerScore = 0;
		int userScore = 0;
		

		for (int count = 0; (count < GAMES_ALLOWED); count++) {
			System.out.print(" Input 1 for rock, 2 for paper, 3 for scissors.");
			int choice = gameInput.nextInt();
			Random generator = new Random();
			int computer = generator.nextInt(MAXIMUM_NUMBER)+1;  

			if ((choice == ROCK) && (computer == ROCK)) 
			{
				System.out.println("You draw as Computer chose rock too.");
			}
			else if ((choice == ROCK) && (computer == PAPER))
			{
				System.out.println("You lose as Computer chose paper.");
				computerScore++;
			}
			else if ((choice == ROCK) && (computer == SCISSORS)) 
			{ 
				System.out.println("You win as Computer chose scissors.");
				userScore++;
			}
			else if ((choice == PAPER) && (computer == ROCK))
			{
				System.out.println("You win as Computer chose rock.");
				userScore++;
			}
			else if ((choice == PAPER) && (computer == PAPER))
			{
				System.out.println("You draw as Computer chose paper too.");
			}
			else if ((choice == PAPER) && (computer == SCISSORS))
			{ 
				System.out.println("You lose as Computer chose scissors.");
				computerScore++;
			}
			else if ((choice == SCISSORS) && (computer == ROCK))
			{
				System.out.println("You lose as computer chose rock.");
				computerScore++;
			}
			else if ((choice == SCISSORS) && (computer == PAPER))
			{
				System.out.println("You win as computer chose paper.");
				userScore++;
			}
			else if ((choice == SCISSORS) && (computer == SCISSORS))
			{
				System.out.println("You draw as Computer chose scissors too.");
			}
			System.out.print("Your final score is " + userScore + " the computers final score is " + computerScore);
		}


	}
}