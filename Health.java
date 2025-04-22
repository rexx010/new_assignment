import java.util.Scanner;

public class Health{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pound: ");
double pound = input.nextDouble();

System.out.print("Enter height in inches: ");
double inches = input.nextDouble();

double KG = 0.45359237;
double meter = 0.0254;

double weight = pound * KG;
double height = meter * inches;

double squareHeight = height * height;

double weightMeasure = weight / squareHeight;

System.out.printf("Body Mass Index is %f%n", weightMeasure);
}
}