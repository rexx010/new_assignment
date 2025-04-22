import java.util.Scanner;

public class ConvertYear{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the number of minute: ");
int num1 = input.nextInt();

int min = 60;
int hours = 24;
int DaysInAYear = 365; 

int minPerDay = 60 * 24;
int days = minPerDay * DaysInAYear;
int years = num1 / days;
double day = (num1 % days) / minPerDay;

System.out.printf("The number of minutes in a year is %d and the number of days is %.0f%n", years, day);
}
}