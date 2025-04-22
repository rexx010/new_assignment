import java.util.Scanner;

public class Finance{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter your balance: ");
int balance = input.nextInt();

System.out.print("Enter your annual percentage: ");
double api = input.nextDouble();

double interest = balance * (api / 1200);

System.out.printf("The interest is %f%n", interest);
}
}