import java.util.Scanner;

public class MysteryGame2{
public static void main(String[] args){

 Scanner input = new Scanner(System.in);

 int random = (int)(Math.random() * 10) + 1;
 //System.out.print(random);

	System.out.print("Guess a number to win the Mystery Game: ");
 	int guess = input.nextInt();
	
  	int total = 0;
  	int counter = 1;
	for (counter = 1; counter != -1; counter++){
	
	if (guess < random) {
	System.out.print("Try again: ");
	guess = input.nextInt();
	}
	else {
	if (guess > random) {
	System.out.print("Try again: ");
	guess = input.nextInt(); 
	}
	else {
	if (guess == random) {
	System.out.print("Congratulations win\n");
	break;
	}

      }
    }

	
}
	total = total + counter;
	System.out.printf("The total number of guesses is %d%n", total);
 }
}