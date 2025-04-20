import java.util.Scanner;

public class UserChoice{
public static void main(String[] args){

Scanner user = new Scanner(System.in);

int smallest = 0;
int highest = 0;
int counter = 1;

for(counter = 1; counter <= 10; counter++){
System.out.println("Enter " +counter+ " number accordingly : ");
int choice = user.nextInt();

//highest = choice;
//smallest = choice;

if(choice > highest){ 
highest = choice;
}

if(choice < smallest) {
smallest = choice;
}
}

System.out.printf("highest is %d smallest is %d%n", highest, smallest);

}
}