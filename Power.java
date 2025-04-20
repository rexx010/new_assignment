import java.util.Scanner;

public class Power{
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int num1 = input.nextInt();

System.out.print("Enter a number: ");
int num2 = input.nextInt();

int power = 1;

for (int counter = 1; counter <= num1; counter++) {

power = power * num2;

}

System.out.printf("The power of num2 is %d%n", power);

}
}