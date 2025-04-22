import java.util.Scanner;

public class Acceleration2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the starting velocity meter/seconds: ");
double velocity1 = input.nextDouble();

System.out.print("Enter the ending velocity meter/seconds: ");
double velocity2 = input.nextDouble();

System.out.print("Enter the time span: ");
double time = input.nextDouble();

double difference = velocity2 - velocity1;
double times = difference / time;

System.out.printf("The average acceleration is %f%n", times);
}
}