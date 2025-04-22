import java.util.Scanner;

public class Driving{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the distance of driving: ");
double distance = input.nextDouble();

System.out.print("Enter the number of gallons per mile: ");
double gallon = input.nextDouble();

System.out.print("Enter the price of gallon: ");
double price = input.nextDouble();

double costOfTrip = distance / gallon * price;

System.out.printf("The cost of driving is $%.2f", costOfTrip);
}
}