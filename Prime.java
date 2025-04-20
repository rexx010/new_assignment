import java.util.Scanner;

public class Prime{
public static void main(String[] args){

Scanner user = new Scanner(System.in);
boolean flag = false;

System.out.print("Enter a number : ");
int choice = user.nextInt();

if(choice == 0 || choice == 1){
System.out.print("Write number above 0 and 1");
}
int count = 2;

while( count <= choice / 2){
 
	if (choice % count == 0){
	flag = true;
	break;

	}
	 count++;

if (!flag)
System.out.println(choice + " is a prime number.");

System.out.print(!flag);
}


}
}