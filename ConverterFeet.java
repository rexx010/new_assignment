import java.util.Scanner;

public class ConverterFeet{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter number of feet taken: ");
double feets = input.nextDouble();

double foot = 0.305;
double feet = foot * feets;

System.out.printf("%.1f feet is %.3f meters", feets, feet );
}
}