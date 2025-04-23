import java.util.Scanner;

public class Prime{
public static void main(String[] args){

Scanner user = new Scanner(System.in);
boolean checker = false;

System.out.print("Enter a number : ");
int num = user.nextInt();

if(num == 0 || num == 1){
System.out.print("Write number above 0 and 1");
}
int count = 2;

while( count <= num / 2){
 
	if (num % count == 0){
	checker = true;
	break;

	}
	 count++;

}

if (!checker){
System.out.println(num + " is a prime number." +!checker);
} 




}
}