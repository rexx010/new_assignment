import java.util.Scanner;

public class Factorial{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = input.nextInt();

int factor = 1;

	for(int multi = 1; multi <= num; multi++) {
		factor = factor * multi;
		
}
	System.out.printf("factorial of the number %d is %d%n", num, factor);







}
}