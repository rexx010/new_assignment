import java.util.Scanner;

public class MysteryGame{
public static void main(String[] args){

 Scanner input = new Scanner(System.in);

 int random = (int)(Math.random() * 10) + 1;
 //System.out.print(random);

 System.out.print("Guess a number between 1 - 10, You have 3 trials: ");
 int guess = input.nextInt();

  int counter = 1;

	while (counter <= 2){
	if (guess == random) {

	}else {
	if (guess < random) {
	System.out.print("low, try again: ");
	guess = input.nextInt();

	}else {
	if (guess > random) {
	System.out.print("high, try again: ");
	guess = input.nextInt(); 
	}
	
      }
    }

	counter++;
}

	
	if (guess > random){
	System.out.print("You lose");
	}
	if (guess < random){
	System.out.print("You lose");
	}
	if (guess == random) {
	System.out.print("You win");
	}


 }
}