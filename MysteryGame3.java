import java.util.Scanner;

public class MysteryGame3{
	public static void main(String[] args){

 	Scanner input = new Scanner(System.in);

 	int random = (int)(Math.random() * 10) + 1;
 	//System.out.print(random);

	System.out.print("Guess a number to win the Mystery Game: ");
 	int guess = input.nextInt();
	
	int total = 0;
	int counter = 1;
	int plus = 1;
  
	for (counter = 1; counter != -1; counter++){
		if (guess < random) {
			System.out.print("Try again: ");
			guess = input.nextInt();
			plus = plus + 1;
		}
		if (guess > random) {
			System.out.print("Try again: ");
			guess = input.nextInt(); 
			plus = plus + 1;

		}
		if (guess == random) {
			System.out.print("Congratulations win\n");
			break;
		}
    
		

		if( plus == 3){
			random = (int)(Math.random() * 10) + 1;
			//System.out.print(random);
 			System.out.print("Random number has been changed \n");	
	plus = 0;


		}
	}

	total = total + counter;
	System.out.printf("The total number of guesses is %d%n", total);



	}
}