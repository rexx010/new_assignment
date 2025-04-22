import java.util.Scanner;

public class NumberInt{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number between 0 and 1000: ");
int num = input.nextInt();

int num0 = num / 10;

int num1 = num % 10;
int num2 = num0 % 10;
int num3 = num0 / 10;

int result = num1 + num2 + num3;
System.out.printf("The sum of the number is %d%n", result);
}
}