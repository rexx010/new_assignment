import java.util.Scanner;

public class EvenNumbers{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a new number: ");
int num1 = input.nextInt();

System.out.print("Enter a new number: ");
int num2 = input.nextInt();

System.out.print("Enter a new number: ");
int num3 = input.nextInt();

System.out.print("Enter a new number: ");
int num4 = input.nextInt();

System.out.print("Enter a new number: ");
int num5 = input.nextInt();

int even = 0;
int odd = 0;

if (num1 % 2 ==  0){
even += num1;
}else {
odd += num1;
}

if (num2 % 2 ==  0){
even += num2;
}else {
odd += num2;
}

if (num3 % 2 ==  0){
even += num3;
}else {
odd += num3;
}

if (num4 % 2 ==  0){
even += num4;
}else {
odd += num4;
}

if (num5 % 2 ==  0){
even += num5;
}else {
odd += num5;
}


System.out.printf("The sum of even numbers is %d while the sum of odd number is %d%n", even, odd);

}
}