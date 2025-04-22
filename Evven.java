import java.util.Scanner;

public class Evven{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter your first number: ");
int num1 = input.nextInt();

System.out.print("Enter your second number: ");
int num2 = input.nextInt();

System.out.print("Enter your third number: ");
int num3 = input.nextInt();

System.out.print("Enter your forth number: ");
int num4 = input.nextInt(); 

System.out.print("Enter your fifth number: ");
int num5 = input.nextInt();


int even = 0;
int largest = num1;
int smallest = num1;
int average = 0;

if(num2 > largest){
largest = num2;
}
if(num3 > largest){
largest = num3;
}
if(num4 > largest){
largest = num4;
}
if(num5 > largest){
largest = num5;
}

if(num2 < smallest){
smallest = num2;
}
if(num3 < smallest){
smallest = num3;
}
if(num4 < smallest){
smallest = num4;
}
if(num5 < smallest){
smallest = num5;
}

if(num1 % 2 ==  0){
even += num1;
average += 1;
}

if(num2 % 2 ==  0){
even += num2;
average += 1;
}

if(num3 % 2 ==  0){
even += num3;
average += 1;
}

if(num4 % 2 ==  0){
even += num4;
average += 1;
}

if(num5 % 2 ==  0){
even += num5;
average += 1;
}


int evenn = even / average;

System.out.printf("Largest is %d%n", largest);
System.out.printf("Smallest is %d%n", smallest);
System.out.printf("Average of the even number is %d%n", evenn);
}
}