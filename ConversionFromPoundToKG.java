import java.util.Scanner;

public class ConversionFromPoundToKG{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number in pound: ");
double pound = input.nextDouble();

double kilogram = 0.454;

double result = pound * kilogram;

System.out.printf("%.3f is %.3f Kilogram", pound, result);
}
}