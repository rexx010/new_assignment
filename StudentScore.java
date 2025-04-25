import java.util.Scanner;

public class StudentScore{
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

System.out.print("Enter a valid number between 1 - 10: ");
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

switch (score){
case 80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100:
System.out.println("A");
++countA;
break;

case 70,71,72,73,74,75,76,77,78,79:
System.out.println("B");
++countB;
break;

case 60,61,62,63,64,65,66,67,68,69:
System.out.println("C");
++countC;
break;

case 50,51,52,53,54,55,56,57,58,59:
System.out.println("D");
++countD;
break;

case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49:
System.out.println("F");
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