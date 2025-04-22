import java.util.Scanner;

public class Acceleration{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the starting velocity meter/seconds: ");
double velocity1 = input.nextDouble();

System.out.print("Enter the ending velocity meter/seconds: ");
double velocity2 = input.nextDouble();

System.out.print("Enter the time span: ");
double time = input.nextDouble();

double result = (velocity2 - velocity1) /time;

System.out.printf("The average acceleration is %f%n", result);
}
}