import java.util.Scanner;

public class Natural{
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int sum = 0;
int counter = 1;

System.out.print("Enter number "+counter+": ");
int num1 = input.nextInt();

for (counter = 1; num1 != -1; counter++) {
System.out.print("Enter number "+counter+": ");
num1 = input.nextInt();

if(counter <= 10){
sum += num1;

}


}

System.out.printf("The sum of the first 10 natural number is %d%n", sum);

}
}