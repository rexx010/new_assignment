import java.util.Scanner;

public class Runway{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter speed in meters/seconds: ");
double v = input.nextDouble();

System.out.print("Enter acceleration in meters/seconds: ");
double a = input.nextDouble();

double runwayLenght = (v * v)  / (2 * a);

System.out.printf("The minimum runway lenght for this airplane is %f%n", runwayLenght);
}
}