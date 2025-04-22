import java.util.Scanner;

public class Temperature{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a new number for amount of water in kilogram: ");
double water = input.nextDouble();

System.out.print("Enter a new number for initial temperature in kilogram: ");
double initialTemp = input.nextDouble();

System.out.print("Enter a new number for final temperature in kilogram: ");
double finalTemp = input.nextDouble();

double result = water * (finalTemp - initialTemp) * 4184;

System.out.printf("the energy required is %.1f%n", result);
}
}