package numbergame;
import java.util.*;
public class numbers {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num=(int)(Math.random() *100 + 1);
		int guess;
		int numguesses = 7;
	
		while(numguesses > 0) {
			System.out.print("GUESS A NUMBER BETWEEN 1 AND 100: ");
			guess = sc.nextInt();
			if(guess == num) {
				System.out.println("CONGRATULATIONS! YOU GOT THE NUMBER, WHICH IS: " +num);
				break;
			}
			else if (guess < num) {
				System.out.println("TOO LOW...");
				
			}
			else {
				System.out.println("TOO HIGH...");
				
			}
			numguesses--;
			if(numguesses == 0) {
				System.out.println("YOU RAN OUT OF GUESSES, THE NUMBER WAS: "+num);
			}
		}
	}
}
