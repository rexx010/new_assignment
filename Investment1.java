import java.util.Scanner;

public class Investment1{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter your investment amount: ");
double amount = input.nextDouble();

System.out.print("Enter annual interest rate: ");
double interestRate = input.nextDouble();

System.out.print("Enter number of years: ");
double years = input.nextDouble();

double monthlyrate = amount * (1 + interestRate / 100);
 
System.out.printf("Accumulated value is %.2f%n", monthlyrate);
}
}