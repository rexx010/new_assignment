import java.util.Scanner;

public class StudentScore2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int countA = 0;
int countB = 0;
int countC = 0;
int countD = 0;
int countE = 0;
int countF = 0;
int positive = 0;
int negative = 0;
int total = 0;


for(int counter = 1; counter <= 10; counter++){

System.out.println("Enter a valid number between 1 - 10: ");
int score = input.nextInt();
if(score < 0){
System.out.println("Invalid Score");
negative++;
counter -=1;
}else{
if(score > 100){
System.out.println("Invalid Score");
//positive -=1;
counter -=1;
}else{

switch (score / 10){
case 8,9,10: System.out.println("A");
++countA;
break;

case 7: System.out.println("B");
++countB;
break;

case 6: System.out.println("C");
++countC;
break;

case 5: System.out.println("D");
++countD;
break;

case 4,3,2,1,0 : System.out.println("F");
++countF;
break;

}
total = countA + countB + countC + countD + countF;
positive++;
 
}
}
}

System.out.printf(" A is %d%n B is %d%n C is %d%n D is %d%n F is %d%n", countA, countB, countC, countD, countF);
System.out.printf("The number of total of  grade count is %d%n", total);
System.out.printf("The number of positive score is %d%n", positive);
System.out.printf("The number of negative score is %d%n", negative);
}
}